public static void main(String[] args) throws Exception {
  List<File> files = findDirectoriesWithSameName("foo", new File("C:\\tmp"));

  for (File f :files) {
    System.out.println(f);
  }    
}