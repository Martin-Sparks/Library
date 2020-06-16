import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Book> book;

    public Library(int capacity){
        this.capacity = capacity;
        this.book = new ArrayList<Book>();
    }

    public int countBooks(){
        return this.book.size();
    }

    public void addBook(Book book) {
        if (this.countBooks() < this.capacity) {
            this.book.add(book);
        }
    }
}





//        Books should have title, author and genre.
//        Write a method to count the number of books in the library.
//        Write a method to add a book to the library stock.
//        Add a capacity to the library and write a method to check if stock is full before adding a book.
