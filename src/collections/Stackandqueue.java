package collections;

import java.util.LinkedList;
class LibraryManager {
    public  LinkedList<String> bookList;
    public LibraryManager() {
        this.bookList = new LinkedList<>();
    }
    public void addBook(String bookTitle) {
        bookList.addFirst(bookTitle);
        System.out.println(bookTitle + " added to the library.");
    }
    public void removeBook() {
        if (!bookList.isEmpty()) {
            String removedBook = bookList.removeFirst();
            System.out.println(removedBook + " removed from the library.");
        } else {
            System.out.println("Library is empty. No books to remove.");
        }
    }
    public void displayBooks() {
        if (!bookList.isEmpty()) {
            System.out.println("Books in the library:");
            for (String book : bookList) {
                System.out.println(book);
            }
        } else {
            System.out.println("Library is empty. No books to display.");
        }
    }
}

public class Stackandqueue {
    public static void main(String[] args) {
        LibraryManager library = new LibraryManager();

        library.addBook("Finmkt 1");
        library.addBook("Finmkt 2");
        library.addBook("Finmkt 3");

        library.displayBooks();

        library.removeBook();
        library.displayBooks();
    }
}
