String input = "17 00 00 00 53 43 43 41 11 00 00 00 AA 35 00 00";
String[] source = input.split(" ");
byte[] sourceBytes = new byte[source.length];
for (int i = 0; i < source.length; i++) {
    sourceBytes[i] = (byte)Integer.parseInt(source[i], 16);
}
ByteBuffer bb = ByteBuffer.wrap(sourceBytes);
bb.order(ByteOrder.LITTLE_ENDIAN);
while (bb.hasRemaining())
    System.out.println(bb.getInt());