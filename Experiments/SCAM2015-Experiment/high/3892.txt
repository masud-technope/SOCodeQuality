try {
    InputStream in = this.getClass().getResourceAsStream("your video file");
    BufferedInputStream bis = new BufferedInputStream(in);
    BufferedOutputStream bus = new BufferedOutputStream(new FileOutputStream(
                                       new File("your new video file")));
    byte[] data = new byte[in.available()];
    int read = in.read(data);
    bus.write(read);
} catch (IOException ex) {
}