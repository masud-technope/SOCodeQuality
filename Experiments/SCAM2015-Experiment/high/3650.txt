public static int recFact(int n)
{
    if(n==0)
    {
        return 1;
    }
    return n * recFact(n-1);
}