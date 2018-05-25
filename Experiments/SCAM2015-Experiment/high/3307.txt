public void switchPairs(){
    if (front==null || front.next==null)
        return ;
    //keep a pointer to next element of front
    ListNode current=front.next;
    //make front point to next element
    front.next=current.next;
    current.next=front;
    front=current;
    //current has moved one step back it points to first.
    //so get it to the finished swap position
    current=current.next;
    while(current.next!=null && current.next.next!=null){
        ListNode temp = current.next.next;
        current.next.next=temp.next;
        temp.next=current.next;
        current.next=temp;
        current=temp.next;
    }
}