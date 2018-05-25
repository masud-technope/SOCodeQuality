ListIterator<Integer> li = randInts.listIterator();
while(li.hasNext()) {
    int i = li.next();
    if(removeInt == i)     // assumes removeInt is an int; use equals() for Integer
        li.remove();
    if(insertAfterInt == i)
        li.add(removeInt);  // the iterator will skip this element, so it won't get removed
}