boolean loop = true;
// global loop
while ((line = rd.readLine()) != null && loop) {
  // line with "all" in it is found?
  if(line.contains("all"))  {    
    // Continue going through the input until end of input
    while((line = rd.readLine()) != null && loop) {  
      // When the line is not empty you have found the line after all!
      if(!line.isEmpty()) {
        System.out.println(line);
        // to stop the loops
        loop = false; 
      }
    }
  }
}