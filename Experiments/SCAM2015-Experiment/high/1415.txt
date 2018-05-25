void expandCapacity(int minimumCapacity) {
    //get the current length add one and double it
    int newCapacity = (value.length + 1) * 2; 
    if (newCapacity < 0) { //if we had an integer overflow
        newCapacity = Integer.MAX_VALUE; //just use the max positive integer
    } else if (minimumCapacity > newCapacity) { //is it enough?
        //if doubling wasn't enough, use the actual length computed
        newCapacity = minimumCapacity;
    }
    //copy the old value in the new array
    value = Arrays.copyOf(value, newCapacity); 
}