public static String trim(String input) {
    BufferedReader reader = new BufferedReader(new StringReader(input));
    StringBuffer result = new StringBuffer();
    try {
        String line;
        while ( (line = reader.readLine() ) != null)
            result.append(line.trim());
        return result.toString();
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}