// use a map for referring to a value given its name
Map<String, Integer> vars = new HashMap<String, Integer>();

// for example, let's use these values
String anything = "dog";
int dog = 10;

// bind a value to a name
vars.put(anything, dog);

// retrieve the value, given its name
vars.get(anything);
=> 10