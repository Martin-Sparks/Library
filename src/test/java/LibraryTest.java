import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void setUp(){
        library = new Library(2);
        book = new Book("Harry Potter", "JK rowling", "Horror");
        book = new Book("Ready Player One", "ernest cline", "Sci-fi");
        book = new Book("1984", "George Orwell", "Documentary");


    }

    @Test
    public void canCountBooks(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void testAddBooks(){
        library.addBook(book);
        assertEquals(1, library.countBooks());
    }


}
