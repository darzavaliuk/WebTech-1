package by.bsuir.task.task14;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book() {
        this.title = "Title";
        this.author = "Author";
        this.price = 0;
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public int hashCode() {
        return (71 * title.hashCode() + 83 * author.hashCode() + Integer.valueOf(price).hashCode() * 29) % 10287;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        if (obj.hashCode() != this.hashCode()) {
            return false;
        }

        Book book = (Book) obj;
        return this.title.equals(book.title) && this.author.equals(book.author) && this.price == book.price;
    }

    @Override
    public String toString() {
        return "Title:" + title + "\nAuthor:" + author + "\nPrice:" + price + "\nEdition:" + edition;
    }

    @Override
    public Book clone() {
        return new Book(this.title, this.author, this.price);
    }
}