int values[] = ...;
Multiset<Integer> ms = HashMultiset.create();
ms.addAll(Ints.asList(list));

int count0 = ms.count(Integer.valueOf(0));
int count1 = ms.count(Integer.valueOf(1));