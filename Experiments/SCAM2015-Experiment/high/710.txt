public File[] listFiles(FilenameFilter filter) {
    String ss[] = list();
    if (ss == null) return null;
    ArrayList v = new ArrayList();
    for (int i = 0 ; i < ss.length ; i++) {
        if ((filter == null) || filter.accept(this, ss[i])) {
            v.add(new File(ss[i], this));
        }
    }
    return (File[])(v.toArray(new File[v.size()]));
}