package by.bsuir.task.task15;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private int isbn;
    private static int edition;
    final int prime = 89;

    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public static int getEdition() {
        return edition;
    }

    public int getPrice() {
        return price;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        if (this.hashCode() != o.hashCode()) {
            return false;
        }
        Book book = (Book) o;
        return price == book.price && Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) && Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = prime * result + title.hashCode();
        result = prime * result + author.hashCode();
        result = prime * result + Integer.valueOf(price).hashCode();
        result = prime * result + Integer.valueOf(isbn).hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nPrice: " + price + "\nisbn: " + isbn;
    }

    @Override
    public Object clone() {
        return new Book(title, author, price, isbn);
    }

    @Override
    public int compareTo(Book obj) {
        return this.isbn - obj.isbn;
    }

}
