boolean isPrime = true;
for(int i=3;i*i<=n;i+=2)
{
    if(n%1==0)
    {
        isPrime = false;
    }
}
if(isPrime)
{
    System.out.println("Your number is prime!");
}
else
{
    System.out.println("Your number isn't prime.");
}