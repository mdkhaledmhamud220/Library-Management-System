public class LibraryManagementSystem {
    private Book[] books;
    private int count;

    public LibraryManagementSystem(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    public void addBook(String title, String author) {
        Book newBook = new Book(title, author);

        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equals(newBook.getTitle()) && books[i].getAuthor().equals(newBook.getAuthor())) {
                System.out.println("The book is already available in the library.");
                return;
            }
        }

        if (count < books.length) {
            books[count++] = newBook;
            System.out.println("Book added successfully.");
        } else {
            System.out.println("The library is full. Cannot add more books.");
        }
    }

    public void removeBook(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equals(title)) {
                books[i] = books[count - 1];
                books[count - 1] = null;
                count--;
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("The book is not available in the library.");
    }

    public void searchBook(String query) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equals(query) || books[i].getAuthor().equals(query)) {
                System.out.println("Titel: " + books[i].getTitle() + ", Author: " + books[i].getAuthor());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No book found matching the query.");
        }
    }

    public void displayBooks() {
        if (count == 0) {
            System.out.println("The library is empty.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println("Titel: " + books[i].getTitle() + ", Author: " + books[i].getAuthor());
            }
        }
    }
}
