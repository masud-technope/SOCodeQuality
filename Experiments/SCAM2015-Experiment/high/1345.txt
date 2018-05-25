Map<String, Boolean> m = new HashMap<String, Boolean>();
for (String str: strs) {
    m.put(str, isInteger(str));
}

public boolean isInteger(String str) {
    int size = str.length();

    for (int i = 0; i < size; i++) {
        if (!Character.isDigit(str.charAt(i))) {
            return false;
        }
    }

    return size > 0;
}