List<String> myString = new ArrayList<String>();

// How you add your data in string list
myString.add("Test 1");
myString.add("Test 2");
myString.add("Test 3");
myString.add("Test 4");

// retrieving data from string list array in for loop
for (int i=0;i < myString.size();i++)
{
  Log.i("Value of element "+i,myString.get(i));
}