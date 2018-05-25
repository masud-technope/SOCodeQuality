public static void main(String[] args){
    Set<String> s1 = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
    s1.addAll(Arrays.asList(new String[] {"a", "b", "c"}));

    Set<String> s2 = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
    s2.addAll(Arrays.asList(new String[] {"A", "B", "C"}));

    System.out.println(s1.equals(s2));
}