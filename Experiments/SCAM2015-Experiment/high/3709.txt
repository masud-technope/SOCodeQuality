public static void generate(int n, int left, int right, ArrayList<String> result,
        StringBuilder sb) {

    if (left < right) {
        return;
    }
    if (left == n && right == n) {
        result.add(sb.toString());
        return;
    }
    if (left == n) {
        generate(n, left, right + 1, result, sb.append(')'));
        sb.deleteCharAt(sb.length() - 1);// <--
        return;
    }
    generate(n, left + 1, right, result, sb.append('('));
    sb.deleteCharAt(sb.length() - 1);// <--
    generate(n, left, right + 1, result, sb.append(')'));
    sb.deleteCharAt(sb.length() - 1);// <--
}