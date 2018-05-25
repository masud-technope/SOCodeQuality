public void Extractor {
    public List<Record> extract(byte[] data) {
        InternalExtractor<Byte> ie = new InternalExtractor<Byte>();
        return ie.internalExtract(ArrayUtils.toObject(data));
    }

    public List<Record> extract(int[] data) {
        ...
    }
}

public void InternalExtractor<T> {
    private List<Record> internalExtract(T[] data) {
        // do the extraction
    }
}