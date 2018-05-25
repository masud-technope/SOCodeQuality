while(sum != num)
{
     if (sum < num)
     {
         upperBound++;
         sum += upperBound * upperBound;
     }
     else if (sum > num)
     {
         sum -= lowerBound * lowerBound;
         lowerBound++;
     }
     if (upperBound > max)
         return false;
}

return true;