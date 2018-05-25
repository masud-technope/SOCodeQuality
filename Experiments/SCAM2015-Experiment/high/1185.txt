String[][] array;
array = new String[][]{new String[]{"a", "b", "c"},new String[]{"d", "e", "f"},new String[]{"g", "h", "i"}};

List<String[]> l = new ArrayList<String[]>(Arrays.asList(array));

l.remove(1);
String[][] array2 = l.toArray(new String[][]{});