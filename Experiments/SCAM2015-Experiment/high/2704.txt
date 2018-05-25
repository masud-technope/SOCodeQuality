public static void reverse(Node previous, Node current) {
    //if there is next node...
    if (current.next != null) {
        //...go forth and pwn
        reverse(current, current.next);
    }

    if (previous == null) {
        // this was the start node
        current.next= null;
    } else {
        //reverse
        current.next= previous;
    }   
}