private static int recursionTest(int num){
    if (num < 10){
       return recursionTest(++num);
    }
    else
       return num;
}