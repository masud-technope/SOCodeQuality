while (num > 0)
    {
        recursion( num - 1 );
        System.out.println(num);
        num = num - 1;           // Decrementing the value of num by 1
    }