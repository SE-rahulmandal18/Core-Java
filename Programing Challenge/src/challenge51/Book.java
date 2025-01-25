package challenge51;

public class Book {
    static int totalNoOfBooks;
    String title;
    String author;
    String isbn;

    boolean isBorrowed;

    static {
        totalNoOfBooks = 0;
    }

    {
        totalNoOfBooks++;
    }

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(String isbn) {
        this(isbn, "Unknown", "Unknown");
    }

    static int getTotalNoOfBooks() {
        return totalNoOfBooks;
    }

    void borrowBook() {
        if (isBorrowed) {
            System.out.println("Books is already borrwoed");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy the book");
        }
    }

    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed , Please leave your review");
        }else {
            System.out.println("This book is alredy in the library");
        }
    }

    public static void main(String[] args) {
        Book designeOfThings = new Book("1", "Designe", "Author");
        Book myBook = new Book("2");
        System.out.println(Book.getTotalNoOfBooks());
        designeOfThings.borrowBook();
        myBook.borrowBook();
        designeOfThings.borrowBook();
        designeOfThings.returnBook();
        designeOfThings.returnBook();
    }
}