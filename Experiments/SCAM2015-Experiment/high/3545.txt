Set<MyThing> myThings = new TreeSet<>(new Comparator<MyThing>() {
        @Override
        public int compare(MyThing  o1, MyThing  o2)
        {
            return o1.getGroupId() - o2.getGroupId(); 
        }
    }); 
myThings.addAll(Arrays.asList(myArray));