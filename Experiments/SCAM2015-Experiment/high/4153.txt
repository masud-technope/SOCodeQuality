public void removeRandomElement() {
        int index = new Random().nextInt(size);
        Node current = head;
        Node prev = head;
        for (int i = 0; i < index; i++) {
            prev = current;
            current = current.next;
        }
        prev.next = current.next;
        current.next = null;
        size--;
    }