String fileName = "MyFile.txt";

try {
    Files.move(new File(fileName).toPath(), new File(fileName).toPath(), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
} catch (IOException ex) {
    Logger.getLogger(SomeClass.class.getName()).log(Level.SEVERE, null, ex);
}