for(int i = 0; i < 4; i++)
{ 
    for(int j = 9; j >= 1; j--) 
    {               
        System.out.print(j);

        for(int k = j; k > 0; k--) 
        {                   
            System.out.print(j);            
        }               
    }
    System.out.println();               
}