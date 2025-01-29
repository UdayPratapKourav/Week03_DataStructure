package doublylinkedlist.librarymanagementsystem;


class LibraryManagement {
    private Book head, tail;
    private int bookCount = 0;

    public void addBook(int bookID, String title, String author, String genre, boolean isAvailable, String position) {
        Book newBook = new Book(bookID, title, author, genre, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else if ("beginning".equals(position)) {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
        bookCount++;
    }

    public void removeBook(int bookID) {
        Book temp = head;
        while (temp != null && temp.bookID != bookID) {
            temp = temp.next;
        }
        if (temp == null) return;
        if (temp == head) head = head.next;
        if (temp == tail) tail = tail.prev;
        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
        bookCount--;
    }

    public void searchBook(String query) {
        Book temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(query) || temp.author.equalsIgnoreCase(query)) {
                System.out.println("Book Found: " + temp.title + " by " + temp.author);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found.");
    }

    public void updateAvailability(int bookID, boolean status) {
        Book temp = head;
        while (temp != null) {
            if (temp.bookID == bookID) {
                temp.isAvailable = status;
                return;
            }
            temp = temp.next;
        }
    }

    public void displayBooksForward() {
        Book temp = head;
        while (temp != null) {
            System.out.println(temp.title + " by " + temp.author + " (" + temp.genre + ") - Available: " + temp.isAvailable);
            temp = temp.next;
        }
    }

    public void displayBooksReverse() {
        Book temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " by " + temp.author + " (" + temp.genre + ") - Available: " + temp.isAvailable);
            temp = temp.prev;
        }
    }

    public int countBooks() {
        return bookCount;
    }

}