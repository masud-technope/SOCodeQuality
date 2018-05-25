String[] fruits = {"orange", "apple"};
    String[] colors = {"red", "blue", "green"};

    Map<String, String[]> map = new HashMap<>();
    map.put("fruits", fruits);
    map.put("colors", colors);

    String[] toCompare = map.get("fruits"); // will return the fruits array