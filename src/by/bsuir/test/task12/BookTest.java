package by.bsuir.test.task12;

import by.bsuir.task.task12.Book;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {
    private static Book book;

    @BeforeAll
    static void beforeAll() {
        book = new Book("Title", "Author", 100);
    }

    @Test
    void testHashCode() {
        Book book1 = new Book("Title", "Author", 100);
        assertEquals(book.hashCode(), book1.hashCode());
    }

    @Test
    void testEquals() {
        Book book1 = new Book("Title", "Author", 100);
        assertEquals(book, book1);
    }

    @Test
    void testToString() {
        assertEquals("Title: Title\nAuthor: Author\nPrice: 100", book.toString());
    }

}