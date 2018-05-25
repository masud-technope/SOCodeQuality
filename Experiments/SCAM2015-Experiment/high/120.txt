Arrays.sort(filenames, new Comparator<String>() {
    @Override
    public int compare(String s1, String s2) {
        // the +1 is to avoid including the '.' in the extension and to avoid exceptions
        // EDIT:
        // We first need to make sure that either both files or neither file
        // has an extension (otherwise we'll end up comparing the extension of one
        // to the start of the other, or else throwing an exception)
        final int s1Dot = s1.lastIndexOf('.');
        final int s2Dot = s2.lastIndexOf('.');
        if ((s1Dot == -1) == (s2Dot == -1)) { // both or neither
            s1 = s1.substring(s1Dot + 1);
            s2 = s2.substring(s2Dot + 1);
            return s1.compareTo(s2);
        } else if (s1Dot == -1) { // only s2 has an extension, so s1 goes first
            return -1;
        } else { // only s1 has an extension, so s1 goes second
            return 1;
        }
    }
});