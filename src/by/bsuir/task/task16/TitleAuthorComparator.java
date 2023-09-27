package by.bsuir.task.task16;

import by.bsuir.task.task12.Book;

import java.util.Comparator;

public class TitleAuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        int titleComparison = book1.getTitle().compareTo(book2.getTitle());
        if (titleComparison != 0) {
            return titleComparison;
        }
        return book1.getAuthor().compareTo(book2.getAuthor());
    }
}

