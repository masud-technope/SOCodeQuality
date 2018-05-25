if (n == 0) 
{
  // special case because fib(0) is 0
  return dictionary[0];
}
else 
{
  int f = dictionary[n];
  if (f == 0) {
    // number wasn't calculated yet.
    f = fibonacci(n-1) + fibonacci(n-2);
    dictionary[n] = f;
  }
  return f;
}