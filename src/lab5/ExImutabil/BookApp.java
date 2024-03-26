package lab5.ExImutabil;

public class BookApp {
    public static void main(String[] args) {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);

        BookCollection bookCollection = new BookCollection(5, book);
        System.out.println("Colecție mutabilă de cărți inițială: " + bookCollection.getBook().getTitle());

        BookCollectionImmutable bookCollectionImmutable = new BookCollectionImmutable(5, book);

        book.setTitle("The Great Gatsby: Revised");

        System.out.println("Colecție mutabilă de cărți după modificare: " + bookCollection.getBook().getTitle());

        Book immutableBook = bookCollectionImmutable.getBook();
        System.out.println("Colecție imutabilă de cărți: " + immutableBook.getTitle());
    }
}
