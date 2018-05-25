import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class CyclicGraphTest 
{   
    public static void main(String[] args) 
    {       
        new CyclicGraphTest().test();           
    }

    public void test()
    {
        NodeManager manager = new NodeManager();
        Node root = manager.processNode("ZZZ");
        root.add(manager.processNode("AAA"));
        manager.get("AAA").add(manager.processNode("BBB"));
        manager.get("AAA").add(manager.processNode("CCC"));
        manager.get("AAA").add(manager.processNode("DDD")); 
        manager.get("DDD").add(manager.processNode("EEE"));
        manager.get("EEE").add(manager.processNode("FFF"));
        manager.get("FFF").add(manager.processNode("AAA"));
        manager.get("AAA").add(manager.processNode("JJJ")); 
        root.add(manager.processNode("EEE"));
        GraphWalker walker = new GraphWalker(manager, root, 1);
        System.out.println(walker.printGraph());        
    }

    /**
     * Basic Node
     */
    public class Node implements Iterable<Node>
    {
        private String id;
        private List<Node> children = new ArrayList<Node>();

        public Node(String id) {            
            this.id = id;
        }

        public boolean add(Node e) {
            return children.add(e);
        }

        public String getId() {
            return id;
        }

        @Override
        public Iterator<Node> iterator() {          
            return children.iterator();
        }           
    }

    /**
     * Cyclical Reference
     * 
     */
    public class ReferenceNode extends Node
    {
        private String refId;

        public ReferenceNode(String id, String refId) {
            super(id);
            this.refId = refId;
        }

        @Override
        public boolean add(Node e) {
            throw new UnsupportedOperationException("Cannot add children to a reference");
        }

        public String getRefId() {
            return refId;
        }           
    }   

    /**
     * Keeps track of all our nodes. Handles creating reference nodes for existing
     * nodes.
     */
    public class NodeManager
    {
        private Map<String, Node> map = new HashMap<String, Node>();

        public Node get(String key) {
            return map.get(key);
        }

        public Node processNode(String id)
        {
            Node node = null;
            if(map.containsKey(id))
            {
                node = new ReferenceNode(getRefId(id), id);
                map.put(node.getId(), node);                
            }
            else
            {
                node = new Node(id);
                map.put(id, node);
            }
            return node;
        }

        private String getRefId(String id) {
            int i = 0;
            String refId = null;
            while(map.containsKey(refId = id + "###" + i)) { i++; }
            return refId;
        }

        public Node resolve(ReferenceNode node) {
            return map.get(node.getRefId());
        }
    }

    /**
     * Walks a tree representing a cyclical graph down to a specified level of recursion
     */
    public class GraphWalker
    {
        private NodeManager manager;
        private Node root;
        private int maxRecursiveLevel;

        public GraphWalker(NodeManager manager, Node root, int recursiveLevel) {
            super();
            this.manager = manager;
            this.root = root;
            this.maxRecursiveLevel = recursiveLevel;
        }

        public String printGraph()
        {
            return printNode(root, 0, "   ").toString();
        }

        private StringBuilder printNode(Node node, int recursionDepth, String prefix) {
            Node resolvedNode = resolveNode(node, recursionDepth);
            if(resolvedNode != node) {
                recursionDepth ++;
                node = resolvedNode;
            }
            StringBuilder sb = new StringBuilder(node.getId());
            int i = 0;
            for(Node child : node)
            {
                if(i != 0) sb.append("\n").append(prefix);
                sb.append(" -> ").append(printNode(child, recursionDepth, prefix + "       "));             
                i++;
            }
            return sb;
        }

        /**
         * Returns a resolved reference to another node for reference nodes when the 
         * recursion depth is less than the maximum allowed
         * @param node
         * @param recursionDepth
         * @return
         */
        private Node resolveNode(Node node, int recursionDepth) 
        {           
            return (node instanceof ReferenceNode) && (recursionDepth < maxRecursiveLevel) ? 
                    manager.resolve((ReferenceNode) node) : node;
        }
    }

}