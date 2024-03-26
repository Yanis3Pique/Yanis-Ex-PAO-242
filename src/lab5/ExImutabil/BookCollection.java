package lab5.ExImutabil;

public class BookCollection {
    private int numberOfBooks;
    private Book book;

    public BookCollection(int numberOfBooks, Book book) {
        this.numberOfBooks = numberOfBooks;
        this.book = book;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
