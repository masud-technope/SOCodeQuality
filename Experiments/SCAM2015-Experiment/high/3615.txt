for(int column = -9; column <= 9; column++)
{
    if (column == 0) column = 2;
    for(int row = 1; row <= 9; row++)
    {
        if(Math.abs(column) <= row)
        { 
            System.out.print(row);
        } else 
        {
            System.out.print(" ");
        }
    }
    System.out.println();
}