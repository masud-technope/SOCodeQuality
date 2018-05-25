// this method is given to you as as. don't modity it
int minVal = minOf( arr, count );
System.out.println( "Smallest number is: " + minVal);

// YOU MUST WRITE THE DEFINITION (code) BELOW MAIN FOR indexOfMin METHOD
int indOfMin = indexOfMin( arr, count );
System.out.println( "Smallest number is located at index position: " + indOfMin);
if (arr[indOfMin] == minVal) {
  System.out.println("Min value passed");
} else {
  System.out.println("Min value failed");
}