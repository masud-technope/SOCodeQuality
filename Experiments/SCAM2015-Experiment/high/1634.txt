public static void swapList(List<Integer> list1, List<Integer> list2){
    List<Integer> tmpList = new ArrayList<Integer>(list1);
    list1.clear();
    list1.addAll(list2);
    list2.clear();
    list2.addAll(tmpList);
}