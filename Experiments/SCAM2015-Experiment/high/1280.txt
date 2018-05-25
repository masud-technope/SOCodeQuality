public PrimitiveArrayWrapper {
    private byte[] byteArray = null;
    private int[] intArray = null;
    ...

    public PrimitiveArrayWrapper(byte[] byteArray) {
        this.byteArray = byteArray;
    }

    // other constructors

    public String extractFoo1(String pattern) {
        if(byteArray != null) {
          // do action on byteArray
        } else if(....) 
        ...
    }
}

public class AlgorithmExtractor {
    public List<Record> do(PrimitiveArrayWrapper wrapper) {
        String  s= wrapper.extractFoo1("abcd");
        ...
    }
}