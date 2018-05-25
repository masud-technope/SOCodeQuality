public static boolean isSymlink(File file) throws IOException {
  if (file == null)
    throw new NullPointerException("File must not be null");
  File canon;
  if (file.getParent() == null) {
    canon = file;
  } else {
    File canonDir = file.getParentFile().getCanonicalFile();
    canon = new File(canonDir, file.getName());
  }
  return !canon.getCanonicalFile().equals(canon.getAbsoluteFile());
}