public static void main(String... args) throws IOException {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 10000; i++)
        sb.append(i);

    for (int j = 0; j < 10; j++)
        test(sb, j >= 2);
}

private static void test(StringBuilder sb, boolean print) {
    List<String> strings = new ArrayList<String>();
    forceGC();
    long free = Runtime.getRuntime().freeMemory();

    long size = 0;
    for (int i = 0; i < 100; i++) {
        final String s = "" + sb + i;
        strings.add(s);
        size += s.length();
    }
    forceGC();
    long used = free - Runtime.getRuntime().freeMemory();
    if (print)
        System.out.println("Bytes per character is " + (double) used / size);
}

private static void forceGC() {
    try {
        System.gc();
        Thread.sleep(250);
        System.gc();
        Thread.sleep(250);
    } catch (InterruptedException e) {
        throw new AssertionError(e);
    }
}