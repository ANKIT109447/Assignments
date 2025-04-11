class Book {
    static int bookCount = 0;
    String title;

    Book(String title) {
        this.title = title;
        bookCount++;
    }

    void display() {
        System.out.println("Title: " + title);
    }

    static void showTotalBooks() {
        System.out.println("Total books created: " + bookCount);
    }
}

public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist");
        Book b2 = new Book("Atomic Habits");
        Book b3 = new Book("Clean Code");

        b1.display();
        b2.display();
        b3.display();

        Book.showTotalBooks();
}
}
