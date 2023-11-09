class Library {
    String[] books;
    int noOfBooks;

    Library() {
        this.books = new String[100];
        this.noOfBooks = 0;
    }

    void addBook(String book) {
        if (noOfBooks < 100) {
            this.books[noOfBooks] = book;
            noOfBooks++;
            System.out.println("The book has been added:\n" + book);
        } else {
            System.out.println("The library is full. Cannot add more books.");
        }
    }

    void showAvailableBooks() {
        System.out.println("Available books are:");
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println(" * " + book);
        }
    }

    void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] != null && this.books[i].equals(book)) {
                System.out.println("The book has been issued: " + book);
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist");
    }

    void returnBook(String book) {
        if (noOfBooks < 100) {
            this.books[noOfBooks] = book;
            noOfBooks++;
            System.out.println("The book has been returned: " + book);
        } else {
            System.out.println("The library is full. Cannot add more books.");
        }
    }
}

public class task2 {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook("Garuda Purana");
        lib.addBook("Mhabharat");
        lib.addBook("Shiv purana");
        lib.addBook("Bhagavata Purana");

        lib.showAvailableBooks();
        lib.issueBook("Shiv purana");

        lib.showAvailableBooks();
        lib.returnBook("Shiv purana");

        lib.showAvailableBooks();
    }
}
