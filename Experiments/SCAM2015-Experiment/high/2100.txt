int sizeOfTheShortestList = Math.min(Alist.size(), Blist.size());
for (int i=0; i<sizeOfTheShortestList; i++) {
    if (Blist.get(i).equals(Alist.get(i))) {
        System.out.println("Equals..: " + Blist.get(i));
    }
}