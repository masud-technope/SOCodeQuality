Writer w = new FileWriter(...);
try {
    // write stuff to the file
} finally {
    try {
        w.close();
    } catch (IOException ex) {
        // Log error writing file and bail out.
    }
}