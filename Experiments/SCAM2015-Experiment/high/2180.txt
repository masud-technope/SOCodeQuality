// Variable names edited for readability
for (String item : pinkList) {
    if (normalList.contains(item)) {
        duplicateList.add(item);
    } else {
        uniqueList.add(item);
    }
}