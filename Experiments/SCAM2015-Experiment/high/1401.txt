ZipInputStream zis = new ZipInputStream(
    new WinZipInputStream(
    new FileInputStream("test.exe")));
while ((ze = zis.getNextEntry()) != null) {
    . . .
    zis.closeEntry();
}
zis.close();