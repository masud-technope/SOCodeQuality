class Chain {
    Chain link = null;
    public Chain(int length) {
        if (length > 1) link = new Chain(length-1);
    }
}