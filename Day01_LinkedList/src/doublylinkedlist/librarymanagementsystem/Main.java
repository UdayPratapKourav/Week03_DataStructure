package doublylinkedlist.librarymanagementsystem;

public class Main {
    public static void main(String[] args) {
        LibraryManagement library = new LibraryManagement();
        library.addBook(1, "Book A", "Author X", "Fiction", true, "end");
        library.addBook(2, "Book B", "Author Y", "Non-Fiction", false, "beginning");
        library.addBook(3, "Book C", "Author Z", "Mystery", true, "end");
        library.displayBooksForward();
        library.updateAvailability(1, false);
        library.searchBook("Author X");
        System.out.println("Total books: " + library.countBooks());
        library.removeBook(2);
        library.displayBooksReverse();
    }

}

