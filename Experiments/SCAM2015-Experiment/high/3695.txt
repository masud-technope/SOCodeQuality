public void printRounded(double[] ds) {
    // create wrapper objects
    int n = ds.length;
    Wrapper[] ws = new Wrapper[n];
    for (int i = 0; i < n; i++)
        ws[i] = new Wrapper(i, (int)(ds[i] * 1000) % 10, (int)(ds[i] * 100));

    // sort by third decimal, descending
    Arrays.sort(ws, new Comparator<Wrapper>() {
        public int compare(Wrapper o1, Wrapper o2) {
            return o2.thirdDecimal.compareTo(o1.thirdDecimal);
        }
    });

    // find number of elements that must be rounded up and increment
    int sum = 0;
    for (int i = 0; i < n; i++)
        sum += ws[i].prefix;
    int numberToIncrement = 100 - (sum % 100);
    for (int i = 0; i < numberToIncrement ; i++)
        ws[i].prefix++;

    // sort back to input order
    Arrays.sort(ws, new Comparator<Wrapper>() {
        public int compare(Wrapper o1, Wrapper o2) {
            return o1.index.compareTo(o2.index);
        }
    });

    // print values
    for (int i = 0; i < n; i++) {
        System.out.println(ws[i].prefix / 100 + "." ws[i].prefix % 100);
    }
}

private class Wrapper {
    public Wrapper(int index, int thirdDecimal, int prefix) {
        this.index = index;
        this.thirdDecimal = thirdDecimal;
        this.prefix = prefix;
    }

    public int index;
    public int thirdDecimal;
    public int prefix;
}