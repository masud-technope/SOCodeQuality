public String readLine(BufferedReader pReader) {
    try {
        return pReader.readLine();
    } catch(IOException IOE) {
        /* Not a very good practice but let say "We don't care!" */
        // Return null if the line is not there (like there was no 4 lines in the file)
        return null;
    }
}

public void importContacts() {
    try {
        BufferedReader infoReader = new BufferedReader(new FileReader("../files/example.txt"));
        txtName   .setText(readLine(infoReader));
        txtPhone  .setText(readLine(infoReader));
        txtMobile .setText(readLine(infoReader));
        txtAddress.setText(readLine(infoReader));
    } catch (IOException ioe) {
        JOptionPane.showMessageDialog(null, ioe.getMessage());
    }
}