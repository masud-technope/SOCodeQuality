String getExtension(String fileName) {
  String found = null;
  for (String ext : EXTS) {
    if (fileName.endsWith("." + ext)) {
      if (found == null || found.length() < ext.length()) {
        found = ext;
      }
    }
  }
  return found;
}