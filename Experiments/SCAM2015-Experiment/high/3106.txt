BufferedReader br = null; // here declare the object you want later to use
 try {
      // now the part that could cause the exception
      br = new BufferedReader(new FileReader(fileName)); 
 } catch (IOException ioe) {
      // handle exception
 }


 if (br != null) {
    // now use br outside of try/catch block
 }