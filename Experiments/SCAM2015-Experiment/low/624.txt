public static void printWords(int length) {

    if (length < 1)
        throw new IllegalArgumentException();

    printWordsRec("", length);
}

private static void printWordsRec(String base, int length) {

    for (char c = 'a'; c <= 'z'; c++) {
        if (length == 1) {
            System.out.println(base + c);
        }
        else {
            printWordsRec(base + c, length - 1);
        }
    }
}