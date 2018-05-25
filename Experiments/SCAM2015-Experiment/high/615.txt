String result[] = new String[a.length+b.length+c.length];
for (int i = 0, j = 0; j < result.length; ++i) {
    if (i < a.length) {
        result[j++] = a[i];
    }
    if (i < b.length) {
        result[j++] = b[i];
    }
    if (i < c.length) {
        result[j++] = c[i];
    }
}