package by.bsuir.test.task16;

import by.bsuir.task.task12.Book;
import by.bsuir.task.task16.AuthorTitlePriceComparator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AuthorTitlePriceTest {
    private static final ArrayList<Book> books = new ArrayList<>();

    @BeforeAll
    static void beforeAll() {
        books.add(new Book("Book ABC", "Author ABC", 1100));
        books.add(new Book("Book BCA", "Author ABC", 120));
        books.add(new Book("Book CAB", "Author CAB", 105));
    }

    @Test
    void testCompare() {
        books.sort(new AuthorTitlePriceComparator());
        assertEquals("Author ABC", books.get(0).getAuthor());
        assertEquals("Author CAB", books.get(2).getAuthor());
        assertEquals("Book CAB", books.get(2).getTitle());
    }
}