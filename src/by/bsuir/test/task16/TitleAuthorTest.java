package by.bsuir.test.task16;

import by.bsuir.task.task12.Book;
import by.bsuir.task.task16.TitleAuthorComparator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TitleAuthorTest {

    private static final ArrayList<Book> books = new ArrayList<>();

    @BeforeAll
    static void beforeAll() {
        books.add(new Book("Book ABC", "Author ABC", 1100));
        books.add(new Book("Book BCA", "Author ABC", 120));
        books.add(new Book("Book CAB", "Author CAB", 105));
    }

    @Test
    void testCompare() {
        books.sort(new TitleAuthorComparator());
        assertEquals("Author ABC", books.get(0).getAuthor());
        assertEquals("Book ABC", books.get(0).getTitle());
        assertEquals(1100, books.get(0).getPrice());
        assertEquals(120, books.get(1).getPrice());
    }
}