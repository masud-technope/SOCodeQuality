// Node
 class Node {
    public int n; // value
    public Node next; // pointer to next node

    @Override
    public String toString() {
        return "Node [n=" + n + ", nextValue=" + next.n + "]";
    }

 }

 // NodeMain
 public class NodeMain {
    public static final int NUMPAIRS = 3;

    public static void main(final String[] args) {
        final Node[] nodeList = new Node[NUMPAIRS * 2];
        for (int i = 0; i < nodeList.length; i++) {
            nodeList[i] = new Node();
            nodeList[i].n = (i + 1) * 10;
            // 10 20 30 40
        }
        for (int i = 0; i < nodeList.length - 1; i++) {
            nodeList[i].next = nodeList[i + 1];
        }
        nodeList[nodeList.length - 1].next = nodeList[0];

        // This makes 1 -> 2 -> 3 -> 4 -> 1 etc.
        printNodes(nodeList);

        for (int i = 0; i < nodeList.length; i += 2) {
            swapNodeNexts(nodeList[i], nodeList[i + 1]);
        }

        // Now: 2 -> 1 -> 4 -> 3 -> 1 etc.
        printNodes(nodeList);

    }

    private static void printNodes(final Node[] nodeList) {
        for (int i = 0; i < nodeList.length; i++) {
            System.out.println("Node " + (i + 1) + ": " + nodeList[i].n
                    + "; next: " + nodeList[i].next.n);
        }
        System.out.println();
    }

    private static void swapNodeNexts(final Node n1, final Node n2) {
        final Node n1Next = n1.next;
        final Node n2Next = n2.next;
        n2.next = n1Next;
        n1.next = n2Next;
    }
 }