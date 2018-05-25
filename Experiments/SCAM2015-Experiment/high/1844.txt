String line;
while ((line = reader.readLine())!=null) {
   int ind = line.indexOf("default =");
   if (ind >= 0) {
      String yourValue = line.substring(ind+"default =".length(), line.length()-1).trim(); // -1 to remove de ";"
      ............
   }
}