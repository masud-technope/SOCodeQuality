private static String setSize(String htmlString) {
    String reg = "size='[0-9]+'";
    Pattern pattern = Pattern.compile(reg);
    Matcher matcher = pattern.matcher(htmlString);
    while (matcher.find()) {
        String sizeString = matcher.group();
        pattern = Pattern.compile("[0-9]+");
        Matcher numMatcher = pattern.matcher(sizeString);
        if (numMatcher.find()) {
            String size = numMatcher.group();
            int realSize = Integer.parseInt(size);
            int resultSize = realSize / 4;
            String resultSizeString = "size='" + resultSize + "'";
            htmlString = htmlString.replaceAll(sizeString, resultSizeString);

        }
    }
    return htmlString;
}