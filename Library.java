import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added: " + book);
    }

    public void viewAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (!book.isCheckedOut()) {
                System.out.println(book);
            }
        }
    }

    public void checkOutBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isCheckedOut()) {
                book.checkOut();
                System.out.println("Checked out: " + book);
                return;
            }
        }
        System.out.println("Book not found or already checked out.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isCheckedOut()) {
                book.returnBook();
                System.out.println("Returned: " + book);
                return;
            }
        }
        System.out.println("Book not found or not checked out.");
    }
}
