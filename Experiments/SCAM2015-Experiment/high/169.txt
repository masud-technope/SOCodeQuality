URI uri = new URI(
    "http", 
    "search.barnesandnoble.com", 
    "/booksearch/first book.pdf",
    null);
URL url = uri.toURL();
//or String request = uri.toString();