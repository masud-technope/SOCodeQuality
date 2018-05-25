BufferedReader reader = new BufferedReader(new FileReader(somepath));
 reader.readLine(); // this will read the first line
 String line1=null;
 while ((line1 = reader.readLine()) != null){ //loop will run from 2nd line
        //some code
 }