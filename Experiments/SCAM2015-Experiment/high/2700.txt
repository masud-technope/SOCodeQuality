ListIterator<Book> iterator = books.listIterator();

while (iterator.hasNext()) {
    Book book = iterator.next();
    if (book.getUsage().equals("NULL")) {
        iterator.remove();
    }
}