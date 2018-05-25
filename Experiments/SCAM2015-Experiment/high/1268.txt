File tmp = File.createTempFile("deleteme", "bin");
tmp.deleteOnExit();
int size = 1024 * 1024 * 1024;

long start0 = System.nanoTime();
FileChannel fc0 = new FileOutputStream(tmp).getChannel();
ByteBuffer bb = ByteBuffer.allocateDirect(32 * 1024).order(ByteOrder.nativeOrder());

for (int i = 0; i < size; i += bb.capacity()) {
    fc0.write(bb);
    bb.clear();
}
long time0 = System.nanoTime() - start0;
System.out.printf("Took %.3f ms to write %,d MB using ByteBuffer%n", time0 / 1e6, size / 1024 / 1024);

long start = System.nanoTime();
FileChannel fc = new FileInputStream(tmp).getChannel();
MappedByteBuffer buffer = fc.map(FileChannel.MapMode.READ_ONLY, 0, size);
LongBuffer longBuffer = buffer.order(ByteOrder.nativeOrder()).asLongBuffer();
long total = 0; // used to prevent a micro-optimisation.
while (longBuffer.remaining() > 0)
    total += longBuffer.get();
fc.close();
long time = System.nanoTime() - start;
System.out.printf("Took %.3f ms to read %,d MB MemoryMappedFile%n", time / 1e6, size / 1024 / 1024);

long start2 = System.nanoTime();
FileChannel fc2 = new FileInputStream(tmp).getChannel();
bb.clear();
while (fc2.read(bb) > 0) {
    while (bb.remaining() > 0)
        total += bb.get();
    bb.clear();
}
fc2.close();
long time2 = System.nanoTime() - start2;
System.out.printf("Took %.3f ms to read %,d MB File via NIO%n", time2 / 1e6, size / 1024 / 1024);