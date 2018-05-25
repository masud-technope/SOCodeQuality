Map<String, List<String>> theMap = ...

if (theMap.containsKey("baz")) {
    theMap.get("baz").add("foo");
}
else {
    List<String> tempList = new ArrayList<String>();
    tempList.add("foo");
    theMap.put("baz", tempList);
}