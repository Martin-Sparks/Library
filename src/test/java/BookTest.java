import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void setUp(){
        book = new Book("Harry Potter", "JK rowling", "Horror");
    }

    @Test
    public void testHasTitle(){
        assertEquals("Harry Potter", book.hasTitle());
    }
}
