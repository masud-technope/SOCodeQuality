public static void main(String[] args) {
    AtomicInteger i = new AtomicInteger(0);
    modify(i);
    System.out.println(i);
}

private static void modify(AtomicInteger x) {
    x.set(2);
}