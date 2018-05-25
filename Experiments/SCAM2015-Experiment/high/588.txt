if (Desktop.isDesktopSupported()) {
    try {
        File myFile = new File("/path/to/file.pdf");
        Desktop.getDesktop().open(myFile);
    } catch (IOException ex) {
        // no application registered for PDFs
    }
}