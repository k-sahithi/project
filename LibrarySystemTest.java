import static org.junit.Assert.*;
import org.junit.Test;

public class LibrarySystemTest {
    @Test
    public void testAddAndCheckOutBook() {
        Library library = new Library();
        Book book = new Book("Test Book", "Test Author");
        library.addBook(book);
        library.checkOutBook("Test Book");
        assertTrue(book.isCheckedOut());
    }

    @Test
    public void testReturnBook() {
        Library library = new Library();
        Book book = new Book("Test Book", "Test Author");
        library.addBook(book);
        library.checkOutBook("Test Book");
        library.returnBook("Test Book");
        assertFalse(book.isCheckedOut());
    }
}
