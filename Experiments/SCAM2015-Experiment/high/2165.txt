// Splits the given array of Strings on the given regex and returns
    // the result in a single array.
    public static String[] splitContent(String regex, String... input) {
        List<String> list = new ArrayList<>();
        for (String str : input) {
            for (String split : str.split(regex)) {
                list.add(split);
            }
        }
        return list.toArray(new String[list.size()]);
    }