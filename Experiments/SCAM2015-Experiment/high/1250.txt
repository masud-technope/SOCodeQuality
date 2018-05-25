public String deDup(String s) {
    return new LinkedHashSet<String>(Arrays.asList(s.split("-"))).toString().replaceAll("(^\\[|\\]$)", "").replace(", ", "-");
}

public static void main(String[] args) {
    System.out.println(deDup("Bangalore-Chennai-NewYork-Bangalore-Chennai"));
}