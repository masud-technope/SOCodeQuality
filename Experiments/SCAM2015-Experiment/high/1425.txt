List<String> list = new ArrayList<String>();
...
for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
    String value = iterator.next();
    if (value.length() > 5) {
        iterator.remove();
    }
}