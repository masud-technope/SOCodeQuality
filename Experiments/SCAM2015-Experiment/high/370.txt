// Passwords with only alphabetic characters.
for (int i = 0; i < 8; i++) {
    System.out.println(RandomStringUtils.randomAlphabetic(8));
}
System.out.println("--------");
// Passwords with alphabetic and numeric characters.
for (int i = 0; i < 8; i++) {
    System.out.println(RandomStringUtils.randomAlphanumeric(8));
}