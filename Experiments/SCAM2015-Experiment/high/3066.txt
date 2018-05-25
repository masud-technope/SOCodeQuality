String[] num = sNums.split(" ");    
  double[] numbers = new double[num.length];   // The valid place for loop

  for (int i = 0; i < num.length; ++i)    
  {    
    numbers[i] = Double.valueOf(num[i]);    
  }    

  for(double item: numbers)  {
    out.print(item + " "); 
  }