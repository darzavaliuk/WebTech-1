package by.bsuir.task.task13;

import by.bsuir.task.task12.Book;

import java.util.Objects;

public class ProgrammerBook extends Book {
    private String language;
    private int level;
    final int prime = 89;

    public ProgrammerBook(String title, String author, int price, String language, int level) {
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    public String getLanguage() {
        return language;
    }

    public int getLevel() {
        return level;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        if (this.hashCode() != o.hashCode()) {
            return false;
        }
        ProgrammerBook that = (ProgrammerBook) o;
        return level == that.level && Objects.equals(language, that.language);
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = prime * result + super.hashCode();
        result = prime * result + language.hashCode();
        result = prime * result + Integer.valueOf(level).hashCode();
        return result;
    }

    @Override
    public String toString(){
        return super.toString() + "\nLanguage: " + language + "\nLevel: " + level;
    }

}