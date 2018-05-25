public static void main (String [] args)
{
    Scanner input = new Scanner (System.in);
    int number;
    while (true)
    {
        System.out.print ("Enter a number");
        number = input.nextInt ();
        while ( (number & 1) == 0) number >>= 1;
        if (number == 1) System.out.println ("Perfect divisor.");
    }