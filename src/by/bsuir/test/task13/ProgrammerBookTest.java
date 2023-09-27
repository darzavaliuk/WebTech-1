package by.bsuir.test.task13;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import by.bsuir.task.task13.ProgrammerBook;

public class ProgrammerBookTest {
    private static ProgrammerBook programmerBook;

    @BeforeAll
    static void beforeAll() {
        programmerBook = new ProgrammerBook("Title", "Author", 100, "Java", 1);
    }

    @Test
    void testToString() {
        assertEquals("Title: Title\nAuthor: Author\nPrice: 100\nLanguage: Java\nLevel: 1", programmerBook.toString());
    }

    @Test
    void testEquals() {
        ProgrammerBook programmerBook1 = new ProgrammerBook("Title", "Author", 100, "Java", 1);
        ProgrammerBook programmerBook2 = new ProgrammerBook("Title", "Author", 10, "Java", 1);
        assertNotEquals(programmerBook1, programmerBook2);
        assertEquals(programmerBook, programmerBook1);
        assertEquals(programmerBook, programmerBook);
    }

    @Test
    void testHashCode() {
        ProgrammerBook programmerBook1 = new ProgrammerBook("Title", "Author", 100, "Java", 1);
        ProgrammerBook programmerBook2 = new ProgrammerBook("Title", "Author", 10, "Java", 1);
        assertNotEquals(programmerBook1.hashCode(), programmerBook2.hashCode());
        assertEquals(programmerBook1.hashCode(), programmerBook.hashCode());
        assertEquals(programmerBook.hashCode(), programmerBook.hashCode());
    }
}