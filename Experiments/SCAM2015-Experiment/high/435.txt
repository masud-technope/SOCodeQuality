public void removeLast() {
  // avoid special case: List is empty
  if (this.head != null) {
    if (this.head.next == null) {
      // handle special case: List has only 1 node
      this.head = null;
    } else {
      LLNode prelast = this.head; // points at node before last (eventually)
      while (prelast.next.next != null) prelast = prelast.next;
      prelast.next = null;
    }
  }
}