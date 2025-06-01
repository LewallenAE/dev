package Library;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class LibraryMenu {
    private Library library;
    private UserInteractionLogger logger = new UserInteractionLogger();
    private LibrarySerializer serializer = new LibrarySerializer();

    public LibraryMenu(Library library) {
        this.library = library;

        // Load serialized data if it exists, else load from books.txt
        List<Book> books = serializer.loadLibrary("src/resources/data/library.ser");
        if (books != null) {
            library.setBooks(books);
            System.out.println("Library loaded successfully from library.ser");
        } else {
            System.out.println("No saved library found. Loading from books.txt...");
            library.loadBooks("src/resources/data/books.txt");
        }
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);

        logger.log("Program started and menu displayed.");

        while (true) {
            System.out.println("\n=== Main Menu ===");
            System.out.println("1. View All Books");
            System.out.println("2. Sort Books by Title");
            System.out.println("3. Sort Books by Author");
            System.out.println("4. Sort Books by Year");
            System.out.println("5. Search for a Book by keyword");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    library.viewAllBooks();
                    logger.logViewAllBooks();
                    break;

                case "2":
                    SortUtil.bubbleSort(library.getBooks(), Comparator.comparing(Book::getTitle));
                    library.viewAllBooks();
                    logger.logSort("title");
                    break;

                case "3":
                    SortUtil.insertionSort(library.getBooks(), Comparator.comparing(Book::getAuthor));
                    library.viewAllBooks();
                    logger.logSort("author");
                    break;

                case "4":
                    SortUtil.quickSort(library.getBooks(), Comparator.comparingInt(Book::getPublicationYear), 0, library.getBooks().size() - 1);
                    library.viewAllBooks();
                    logger.logSort("year");
                    break;

                case "5":
                    System.out.print("Enter keyword (title, author, or year): ");
                    String keyword = scanner.nextLine();
                    Book found = library.searchBookByKeyword(keyword);
                    if (found != null) {
                        System.out.println("Book found: " + found);
                    } else {
                        System.out.println("Book not found.");
                    }
                    logger.logSearch(keyword);
                    break;

                case "6":
                    serializer.saveLibrary(library.getBooks(), "src/resources/data/library.ser");
                    logger.log("Program exited. Library saved.");
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice. Please enter 1-6.");
            }
        }
    }
}

