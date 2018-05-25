public void writeTextFile(String filename, double s){
 FileWriter output=null;
 try{
  output= new FileWriter(filename);
  BufferedWriter writer=new BufferedWriter(output);
  String ss = String.valueOf(s);
  writer.append(ss);
  writer.close();
} catch (Exception e) {
  throw new RuntimeException(e);
} finally {
  if (output != null) {
  try {
    output.flush();
    output.close();
  } catch (IOException e) {

  }
}
}
}