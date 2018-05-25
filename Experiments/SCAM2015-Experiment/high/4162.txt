//array of HashMaps which have Strings as key and value types
HashMap<String, String>[] cars = new HashMap<String, String>[2];

HashMap<String, String> first = new HashMap<String, String>();
first.put("name", "vauxhall");
first.put("doors", "5");
first.put("color", "black");

HashMap<String, String> second = new HashMap<String, String>();
second.put("name", "peogeot");
second.put("doors", "3");
second.put("color", "red");

//put those two maps into the array of maps
cars[0] = first;
cars[1] = second;