package com.kodilla.books.domain;

import com.kodilla.books.BookType;
import com.vaadin.flow.component.textfield.TextField;

public class Book {

    private String title;
    private String author;
    private String publicationYear;
    private Enum<BookType> type;

    public Book() {
    }

    public Book(String title, String author, String publicationYear, Enum <BookType> type) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Enum <BookType> getType() {
        return type;
    }

    public void setType(Enum <BookType> type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (!getTitle().equals(book.getTitle())) return false;
        if (!getAuthor().equals(book.getAuthor())) return false;
        if (!getPublicationYear().equals(book.getPublicationYear())) return false;
        return getType().equals(book.getType());

    }

    @Override
    public int hashCode() {
        int result = getTitle().hashCode();
        result = 31 * result + getAuthor().hashCode();
        result = 31 * result + getPublicationYear().hashCode();
        result = 31 * result + getType().hashCode();
        return result;
    }
}