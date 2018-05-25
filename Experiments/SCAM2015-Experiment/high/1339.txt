public static final int NUMPAIRS = 3;
 public static void main(final String[] args) {
    final Node[] nodeList = new Node[NUMPAIRS * 2];
    for (int i = 0; i < nodeList.length; i++) {
        nodeList[i] = new Node();
        nodeList[i].n = (i + 1) * 10;
        // 10 20 30 40
    }
    // ...
 }