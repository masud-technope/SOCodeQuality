public void stringArrayTest() throws IOException, ClassNotFoundException, DecoderException {
    String[] strs = new String[] {"test 1", "test 2", "test 3"};
    System.out.println(Arrays.toString(strs));

    // serialize
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    new ObjectOutputStream(out).writeObject(strs);

    // your string
    String yourString = new String(Hex.encodeHex(out.toByteArray()));
    System.out.println(yourString);

    // deserialize
    ByteArrayInputStream in = new ByteArrayInputStream(Hex.decodeHex(yourString.toCharArray()));
    System.out.println(Arrays.toString((String[]) new ObjectInputStream(in).readObject()));
}