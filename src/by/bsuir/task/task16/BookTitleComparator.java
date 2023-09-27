package by.bsuir.task.task16;

import by.bsuir.task.task12.Book;

import java.util.Comparator;

public class BookTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        int authorComparison = book1.getAuthor().compareTo(book2.getAuthor());
        if (authorComparison != 0) {
            return authorComparison;
        }
        int titleComparison = book1.getTitle().compareTo(book2.getTitle());
        if (titleComparison != 0) {
            return titleComparison;
        }
        return Integer.compare(book1.getPrice(), book2.getPrice());
    }
}