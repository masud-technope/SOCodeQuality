static String name = "Paul";

public static String rename(String originalName, String newName) {
    originalName = newName;
    return originalName;
}

public static void rename(String newName) {
    name = newName;
}

public static void main(String[] args) {
    System.out.println(rename(name, "Sally"));
    System.out.println(name); //name = "Paul"

    rename("Sally");
    System.out.println(name); //name = "Sally"
}