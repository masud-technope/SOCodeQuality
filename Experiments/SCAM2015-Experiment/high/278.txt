final ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
final DataOutputStream out = new DataOutputStream(byteOut);
...
    out.writeInt(value);
...
out.flush();
final byte[] bytes = byteOut.toByteArray();
final int[] ints = new int[bytes.length/4];
final ByteArrayInputStream byteIn = new ByteArrayInputStream(bytes);
final DataInputStream in = new DataOutputStream(byteIn);
for (int ct=0; ct<ints.length; ++ct) {
    ints[ct] = in.readInt();
}