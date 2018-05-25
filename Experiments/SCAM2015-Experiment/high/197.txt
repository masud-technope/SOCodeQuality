int py_div(int a, int b)
{
  if (a < 0)
    if (b < 0)
      return -a / -b;
    else
      return -(-a / b) - (-a % b != 0 ? 1 : 0);
  else if (b < 0)
      return -(a / -b) - (a % -b != 0 ? 1 : 0);
    else
      return a / b;
}

int py_mod(int a, int b)
{
  if (a < 0)
    if (b < 0)
      return -(-a % -b);
    else
      return -a % b - (-a % -b != 0 ? 1 : 0);
  else if (b < 0)
      return -(a % -b) + (-a % -b != 0 ? 1 : 0);
    else
      return a % b;
}