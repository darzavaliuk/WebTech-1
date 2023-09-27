package by.bsuir.test.task15;
import by.bsuir.task.task15.Book;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

class BookTest {

    @Test
    void testBook_OneBook() {
        List<Book> books = new ArrayList<>(List.of(
                new Book("Title1", "HelloWorld2", 65, 19)
        ));
        List<Book> expected = List.of(
                new Book("Title1", "HelloWorld2", 65, 19)
        );
        Collections.sort(books);
        assertEquals(expected, books);
    }

    @Test
    void testBook_SeveralBooks() {
        List<Book> books = new ArrayList<>(List.of(
                new Book("NewTitle3", "HelloWorld", 65, 109),
                new Book("NewTitle10", "HelloWorld10", 35, 542),
                new Book("NewTitle2", "HelloWorld2", 10, 24)
        ));
        List<Book> expected = List.of(
                new Book("NewTitle2", "HelloWorld2", 10, 24),
                new Book("NewTitle3", "HelloWorld", 65, 109),
                new Book("NewTitle10", "HelloWorld10", 35, 542)
        );
        Collections.sort(books);
        assertEquals(expected, books);
    }
}