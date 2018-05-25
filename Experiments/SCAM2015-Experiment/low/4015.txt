try (RandomAccessFile srcFile = new RandomAccessFile("data/data.bin", "r");
     FileChannel srcChan = srcFile.getChannel();) 
{
    //    Careful with these casts if you have large files - channel size is a long
    ByteBuffer ib = ByteBuffer.allocate((int)srcChan.size());
    ib.order(ByteOrder.LITTLE_ENDIAN);
    srcChan.read(ib);
    IntBuffer fb = ((ByteBuffer)ib.rewind()).asIntBuffer();
    while (fb.hasRemaining())
        System.out.println(fb.get());
}