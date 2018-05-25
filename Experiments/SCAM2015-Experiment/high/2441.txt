public class Book {

    private double price;
    private int isbn;
    private String title;
    private Author author;

    public Book(Author a) {
        author = a;
    }

    public Book(String title, Author author, double price, int isbn) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.isbn = isbn;
    }

    public void setTitleBook(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setPriceBook(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getIsbn() {
        return isbn;
    }
}