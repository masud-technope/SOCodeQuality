static bool OddIsPrime (long oddvalue)  // test an odd >= 3 
{
    // Only test odd divisors.
    for (long i = 3; i <= Math.Sqrt(oddvalue); i += 2)
    {
        if (value % i == 0)
            return false;
    }
    return true;
}

static void Main(string[] args)
{
    long max = 600851475143;   // an odd value
    long maxFactor = 0;

    // Only test odd divisors of MAX. Limit search to Square Root of MAX.
    for (long i = 3; i <= Math.Sqrt(max); i += 2)
    {
        if (max % i == 0)
        {
            if (OddIsPrime(i))  // i is odd
            {
                maxFactor = i;
            }
        }
    }
    Console.WriteLine(maxFactor.ToString());
    Console.ReadLine();
}