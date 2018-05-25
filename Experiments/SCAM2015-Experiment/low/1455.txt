public static void main (String [] args)
{
    List <Integer> myarray = new ArrayList <Integer> ();
    System.out.println ("Enter integers into the system, to quit enter -99");
    Scanner scan = new Scanner (System.in);

    while (scan.hasNextInt ())
    {
        int temp = scan.nextInt ();
        if (temp == -99)
        {
            System.out.println ("Successfully terminated by inputting -99");
            System.out.println ();
            break;
        }
        else {
            myarray.add (temp);
            if (myarray.size () == 50)
            {
                System.out.println ("successfully filled array fully up");
                System.out.println ();
            }
        }
    }
    for (int i : myarray)
    {
        System.out.print (i + ",");
    }
    System.out.print ("}");

    Set <Integer> hsi = new HashSet <Integer> (); 
    hsi.addAll (myarray);

    Collections.sort (myarray);
    System.out.println ("Array list: {");
    int idx = 0;
    for (int i: hsi) {
        System.out.println (i + "\t" + Collections.frequency (myarray, i));
    }
    System.out.println (myarray.size ());
}