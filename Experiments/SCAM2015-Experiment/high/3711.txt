public static ArrayList<String> generateParenthesis(int n) {

    ArrayList<String> result = new ArrayList<String>();
    StringBuilder sb = new StringBuilder(2 * n);

    generate(2 * n, 0, 0, result, sb);
    //       ^^^^^
    return result;
}