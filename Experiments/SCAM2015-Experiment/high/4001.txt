// We want numbers between 0 and 9 inclusive
int min = 0, max = 9; 
// We need a Collection, lets use a List, could use any ordered collection here
List<Integer> nums = new ArrayList<>();
// Put the numbers in the collection
for (int n=min; n<=max; n++) { nums.add(n); }

// Randomly sort (shuffle) the collection
Collections.shuffle(nums);

// Pull numbers from the collection (the order should be random now)
for (int count=0; count<nums.length; count++) {
    System.out.println("Number " + count + " is " + nums.get(count));
}