int myNumber = 490;
int distance = Math.abs(numbers[0] - myNumber);
int idx = 0;
for(int c = 1; c < numbers.length; c++){
    int cdistance = Math.abs(numbers[c] - myNumber);
    if(cdistance < distance){
        idx = c;
        distance = cdistance;
    }
}
int theNumber = numbers[idx];