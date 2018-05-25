...
if (n <= 0) 
  System.out.println("ERROR:n<=0");
else {
  // Why do we need array/ArrayList etc.? We are supposed to build a string!
  StringBuilder Sb = new StringBuilder();

  // while we have something to do... 
  // (are we supposed to compute exact number of steps? No)
  while (n > 0) {
    Sb.insert(0, n % 2);
    n /= 2;    
  }

  System.out.println(Sb.toString());
}