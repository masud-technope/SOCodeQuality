linkedList list = new linkedList();
list.add("foo");
list.add("bar");
Node tmp = lst.getHead();
while(tmp != null){
    System.out.println(tmp.getData());
    tmp = tmp.getNext();
}