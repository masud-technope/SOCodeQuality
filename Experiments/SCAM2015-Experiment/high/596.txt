List<File> getSubdirs(File file) {
    List<File> subdirs = Arrays.asList(file.listFiles(new FileFilter() {
        public boolean accept(File f) {
            return f.isDirectory();
        }
    }));
    subdirs = new ArrayList<File>(subdirs);

    List<File> deepSubdirs = new ArrayList<File>();
    for(File subdir : subdirs) {
        deepSubdirs.addAll(getSubdirs(subdir)); 
    }
    subdirs.addAll(deepSubdirs);
    return subdirs;
}