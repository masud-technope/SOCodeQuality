String[] merge(String[]... arrays) {
    int length = 0;
    for (String[] a: arrays) {
        length += a.length;
    }
    String result[] = new String[length];
    for (int i = 0, j = 0; j < length; ++i) {
        for (String[] a: arrays) {
            if (i < a.length) {
                result[j++] = a[i];
            }
        }
    }
    return result;
}