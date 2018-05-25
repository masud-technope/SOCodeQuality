public static void generate(int maxLength, int left, int right,
        ArrayList<String> result, StringBuilder sb) {
    if (left + right == maxLength) {
        if (left == right)
            result.add(sb.toString());
    } else if (left >= right) {
        generate(maxLength, left + 1, right, result, sb.append('('));
        sb.deleteCharAt(sb.length() - 1);

        generate(maxLength, left, right + 1, result, sb.append(')'));
        sb.deleteCharAt(sb.length() - 1);
    }
}