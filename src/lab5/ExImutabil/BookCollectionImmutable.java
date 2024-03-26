package lab5.ExImutabil;

public final class BookCollectionImmutable {
    private final int numberOfBooks;
    private final Book book;

    public BookCollectionImmutable(int numberOfBooks, Book book) {
        this.numberOfBooks = numberOfBooks;
        this.book = new Book(book);
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public Book getBook() {
        return new Book(book);
    }
}

