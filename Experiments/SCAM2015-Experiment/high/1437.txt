public void removeDuplicate() //searches the LinkedList for duplicate elements, and removes them
   {
   ListIterator iter = listIterator();

    HashSet tempSet = new HashSet();


        while (iter.hasNext())
        {

        Object obj = iter.next();
                      if(tempSet.contains(obj))){
                          iter.remove();
                      }else{
                            tempSet.add(obj);
                      }
        }

} //end removeDuplicate