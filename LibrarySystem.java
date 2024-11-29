import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        String choice;

        // Adding some books to the library
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));

        do {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. View Available Books");
            System.out.println("2. Check Out a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    library.viewAvailableBooks();
                    break;
                case "2":
                    System.out.print("Enter the title of the book to check out: ");
                    String checkOutTitle = scanner.nextLine();
                    library.checkOutBook(checkOutTitle);
                    break;
                case "3":
                    System.out.print("Enter the title of the book to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case "4":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!choice.equals("4"));

        scanner.close();
    }
}
