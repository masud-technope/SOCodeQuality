ArrayList<point> orderedList = new ArrayList<point>();

orderedList.add(myList.remove(0)); //Arbitrary starting point

while (myList.size() > 0) {
   //Find the index of the closest point (using another method)
   int nearestIndex=findNearestIndex(orderedList.get(orderedList.size()-1), myList);

   //Remove from the unorderedList and add to the ordered one
   orderedList.add(myList.remove(nearestIndex));
}