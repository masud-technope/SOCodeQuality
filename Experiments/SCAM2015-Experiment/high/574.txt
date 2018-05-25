String source = "Hello World";

for (String part : source.split(" ")) {
    System.out.print(new StringBuilder(part).reverse().toString());
    System.out.print(" ");
}