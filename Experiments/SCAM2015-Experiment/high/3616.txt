int choice = 0 ;
 try{
   choice = Integer.parseInt(input.next());
 }
catch(NumberFormatException e)
{
    System.out.println("invalid value enetered");
}

// Now you can check if option selected is between 1 & 4
//  and throw some custom exception