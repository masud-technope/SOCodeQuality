List<Integer> list1 = getList1Magic();
List<Integer> list2 = getList2Magic();

if (isSwapReferences()) {
  // this does not affect the actual lists
  List<Integer> temp = list2;
  list2 = list1;
  list1 = temp;
} else if (isSwapListContent()) {
  // this modifies the lists
  swapList(list1, list2);  // method from above
}