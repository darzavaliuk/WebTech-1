package by.bsuir.test.task14;
import by.bsuir.task.task14.Book;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {
    @Test
    void testBook_General() {
        Book book = new Book("Title", "Author", 345);
        assertEquals(book, book.clone());
    }
}
