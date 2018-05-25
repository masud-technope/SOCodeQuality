static final Map<String, String> map;

static {
    map = new HashMap<String, String>();
    String[][] pairs = {
        {"foo", "bar"},
        {"x", "y"}
    };
    for (String[] pair : pairs) {
        map.put(pair[0], pair[1]);
    }
}