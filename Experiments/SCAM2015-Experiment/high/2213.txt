public int sumDigit(int n){

      int sum = n % 9;
      if(sum == 0){
          if(n > 0)
               return 9;
      }
      return sum;
}