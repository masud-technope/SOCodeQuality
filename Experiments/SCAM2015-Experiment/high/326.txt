ZipOutputStream zos = ...

while (...) {
    zos.putNextEntry(...);
    while (...) {
       zos.write(...);
    }
    zos.closeEntry();
}