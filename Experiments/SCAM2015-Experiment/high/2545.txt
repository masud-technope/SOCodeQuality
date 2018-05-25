public char[][] createMatrixFromStrings(String s1, String s2, String s3) {
    char[][] theMatrix = new char[3][]; //yes, hardcoded
    theMatrix[0] = s1.toCharArray();
    theMatrix[1] = s2.toCharArray();
    theMatrix[2] = s3.toCharArray();
    return theMatrix;
}