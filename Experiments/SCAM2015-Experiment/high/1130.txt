ByteArrayOutputStream baos = new ByteArrayOutputStream();

// Fake code simulating the copy
// You can generally do better with nio if you need...
// And please, unlike me, do something about the Exceptions :D
byte[] buffer = new byte[1024];
int len;
while ((len = input.read(buffer)) > -1 ) {
    baos.write(buffer, 0, len);
}
baos.flush();

// Open new InputStreams using the recorded bytes
// Can be repeated as many times as you wish
InputStream is1 = new ByteArrayInputStream(baos.toByteArray()); 
InputStream is2 = new ByteArrayInputStream(baos.toByteArray());