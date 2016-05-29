
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class BookDALTest {

    private static BookDAL mockBookDAL;
    private static Book bookA;
    private static Book bookB;

    @Before
    public void setUp() throws Exception {
        mockBookDAL = mock(BookDAL.class);
        bookA = new Book("8131721019","Compilers Principles",
                Arrays.asList("D. Jeffrey Ulman", "Ravi Sethi", "Alfred V. Aho", "Monica S. Lam"),
                "Pearson Education Singapore Pte Ltd", 2008,1009,"BOOK_IMAGE");
        bookB = new Book("9788183331630","Let Us C 13th Edition",
                Arrays.asList("Yashavant Kanetkar"),"BPB PUBLICATIONS", 2012,675,"BOOK_IMAGE");

        //Stubbing the methods of mocked BookDAL with mocked data
        when(mockBookDAL.getAllBooks()).thenReturn(Arrays.asList(bookA, bookB));
        when(mockBookDAL.getBook("8131721019")).thenReturn(bookA);
        when(mockBookDAL.addBook(bookA)).thenReturn(bookA.getIsbn());
        when(mockBookDAL.updateBook(bookA)).thenReturn(bookA.getIsbn());
    }

    @Test
    public void testGetAllBooks() throws Exception {
        List<Book> allBooks = mockBookDAL.getAllBooks();
        assertEquals(2, allBooks.size());
        Book myBook = allBooks.get(0);
        assertEquals("8131721019", myBook.getIsbn());
        assertEquals("Compilers Principles", myBook.getTitle());
        assertEquals(4, myBook.getAuthors().size());
        assertEquals((Integer)2008, myBook.getYearOfPublication());
        assertEquals((Integer) 1009, myBook.getNumberOfPages());
        assertEquals("Pearson Education Singapore Pte Ltd", myBook.getPublication());
        assertEquals("BOOK_IMAGE", myBook.getImage());
    }

    public void testGetBook() throws Exception {
        String isbn = "8131721019";

        Book myBook = mockBookDAL.getBook(isbn);

        assertNotNull(myBook);
        assertEquals(isbn, myBook.getIsbn());
        assertEquals("Compilers Principles", myBook.getTitle());
        assertEquals(4, myBook.getAuthors().size());
        assertEquals("Pearson Education Singapore Pte Ltd", myBook.getPublication());
        assertEquals((Integer)2008, myBook.getYearOfPublication());
        assertEquals((Integer)1009, myBook.getNumberOfPages());
    }

    public void testAddBook() throws Exception {
        String isbn = mockBookDAL.addBook(bookA);
        assertNotNull(isbn);
        assertEquals(bookA.getIsbn(), isbn);
    }

    public void testUpdateBook() throws Exception {
        String isbn = mockBookDAL.updateBook(bookA);
        assertNotNull(isbn);
        assertEquals(bookA.getIsbn(), isbn);
    }

    @After
    public void tearDown() throws Exception {


    }
}
