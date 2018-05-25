Integer[] arr = new Integer[10]; 

for (int i = 0; i < arr.length; i++) { 
    arr[i] = i; 
} 

Collections.shuffle(Arrays.asList(arr)); 

for (int i = 0; i < arr.length; i++) { 
    System.out.print(arr[i] + " "); 
}