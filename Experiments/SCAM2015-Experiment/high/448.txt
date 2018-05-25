// Substitute appropriate type.
ArrayList<...> a = new ArrayList<...>();

// Add elements to list.

// Generate an iterator. Start just after the last element.
ListIterator li = a.listIterator(a.size());

// Iterate in reverse.
while(li.hasPrevious()) {
  System.out.println(li.previous());
}