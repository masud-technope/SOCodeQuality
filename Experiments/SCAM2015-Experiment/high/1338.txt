public static void swapNodeNexts(final Node n1, final Node n2) {  
    final Node n1Next = n1.next;  
    final Node n2Next = n2.next;  
    n2.next = n1Next;  
    n1.next = n2Next;  
 }