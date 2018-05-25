for(int i = 0; i < 2dArray.length; i++){
  for(int j = i; j < 2dArray.length; j++){
    if(Integer.valueOf(2dArray[j][0]) > Integer.valueOf(2dArray[j+1][0])){
       String temp[] = 2dArray[j+1];
       2dArray[j+1] = 2dArray[j];
       2dArray[j] = temp;                  
    }
  }
}