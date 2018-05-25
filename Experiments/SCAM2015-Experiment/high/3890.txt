File file = new File("your file");
FileWriter fw = new FileWriter(file.getAbsoluteFile());
BufferedWriter bw = new BufferedWriter(fw);
BufferedReader br = new BufferedReader(new FileReader("your file"));
while ((currentLine = br.readLine()) != null) {
    bw.write(currentLine);
}
bw.close();
br.close();