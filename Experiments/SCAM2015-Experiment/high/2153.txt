Reader reader = new FileReader("input.txt");
try {
    char[] chars = new char[8192];
    for(int len; (len = reader.read(chars)) > 0;) {
        // process chars.
    }
} finally {
    reader.close();
}