public static void main(String args[])
  {

       Scanner kb = new Scanner(System.in);
       int salary = 0;
       double federaltax =0;
       double netsalary=0;
       double totaltax = 0;
       double statetax=0;
       int over_100000=0;
       int between50_100000=0;
       int between25_50000=0;
       int below25000=0;
       String stop="";
       int count=0;
       do
       {
           System.out.println("Please Input your salary");
           salary = kb.nextInt();
                            if(salary >= 100000) 
                            {
                                 statetax= salary * .05;
                                 federaltax = salary * .20; 
                                 netsalary = statetax + federaltax;

                            }
                            else
                            {
                                 statetax= salary * .05;
                                 federaltax = salary * .15; 
                                 netsalary = statetax + federaltax;                  

                            }
                            if(salary >= 100000) 
                            {
                             over_100000 =  over_100000 + 1;
                            }
                            else if(salary >= 50000 && salary <=100000) 
                            {
                             between50_100000 =  between50_100000 + 1;
                            }
                            else if(salary >= 25000 && salary <=50000) 
                            {
                             between25_50000 =  between25_50000 + 1;
                            }
                            else
                            {
                              below25000 = below25000 + 1;
                            }


           System.out.println("Federal tax :" + federaltax);
           System.out.println("netsalary :" + netsalary);
           System.out.println("statetax :" + statetax);
           System.out.println("salary :" + salary);
           System.out.println("Over 100000: " + over_100000);
           System.out.println("Between 50000 and 100000: " + between50_100000);
           System.out.println("Between 25000 and 50000: " +  between25_50000);
           System.out.println("Below 25000:" +  below25000);

           System.out.println("Do you want to continue?"); 
           stop = kb.nextLine();

      }while(stop.equals("yes"));

   }