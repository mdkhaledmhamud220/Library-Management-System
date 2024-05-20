import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryManagementSystem library = new LibraryManagementSystem(10);

        while (true) {
            System.out.println("\nLibrary Management System Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter book title: ");
                String title = scanner.nextLine();
                System.out.print("Enter book author: ");
                String author = scanner.nextLine();
                library.addBook(title, author);
            } else if (choice == 2) {
                System.out.print("Enter book title to remove: ");
                String removeTitle = scanner.nextLine();
                library.removeBook(removeTitle);
            } else if (choice == 3) {
                System.out.print("Enter book title or author to search: ");
                String searchQuery = scanner.nextLine();
                library.searchBook(searchQuery);
            } else if (choice == 4) {
                library.displayBooks();
            } else if (choice == 5) {
                System.out.println("Exiting the system.");
                scanner.close();
                return;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }

        }
    }
}
