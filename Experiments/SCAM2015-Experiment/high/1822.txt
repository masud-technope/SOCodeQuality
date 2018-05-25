IntBuffer intBuf =
   ByteBuffer.wrap(byteArray)
     .order(ByteOrder.BIG_ENDIAN)
     .asIntBuffer();
 int[] array = new int[intBuf.remaining()];
 intBuf.get(array);