public char[][] createMatrixFromStrings(String ... strings) {
    if (strings == null || strings.length == 0) return null;
    char[][] theMatrix = new char[strings.length][];
    int i = 0;
    for(String s : strings) {
        theMatrix[i++] = s.toCharArray();
    }
    return theMatrix;
}