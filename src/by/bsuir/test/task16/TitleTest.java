package by.bsuir.test.task16;

import by.bsuir.task.task12.Book;
import by.bsuir.task.task16.TitleComparator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TitleTest {
    private static final ArrayList<Book> books = new ArrayList<>();

    @BeforeAll
    static void beforeAll() {
        books.add(new Book("BCA", "Author1", 10));
        books.add(new Book("ABC", "Author2", 15));
        books.add(new Book("CAB", "Author3", 20));
    }

    @Test
    void testCompare() {
        books.sort(new TitleComparator());
        assertEquals("ABC", books.get(0).getTitle());
        assertEquals("BCA", books.get(1).getTitle());
        assertEquals("CAB", books.get(2).getTitle());
    }
}