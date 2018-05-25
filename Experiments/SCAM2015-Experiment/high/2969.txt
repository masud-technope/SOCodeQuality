@Test
public void testByteArray() throws IOException, ClassNotFoundException, InterruptedException {
    Hello h = new Hello();

    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    ObjectOutput out = new ObjectOutputStream(bos);
    out.writeObject(h);
    byte b[] = bos.toByteArray();
    out.close();
    bos.close();

    Hello h2;
    ByteArrayInputStream bis = new ByteArrayInputStream(b);
    ObjectInput in = new ObjectInputStream(bis);
    h2 = (Hello) in.readObject();

    assertTrue(10 == h2.getX());
    assertTrue(20 == h2.getY());
}