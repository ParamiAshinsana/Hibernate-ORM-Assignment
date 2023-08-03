package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Author {
    @Id
    private String author_id;
    private String author_name;

    @ManyToOne
    private Book book;

    public Author() {
    }

    public Author(String author_id, String author_name, Book book) {
        this.author_id = author_id;
        this.author_name = author_name;
        this.book = book;
    }

    public String getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(String author_id) {
        this.author_id = author_id;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Author{" +
                "author_id='" + author_id + '\'' +
                ", author_name='" + author_name + '\'' +
                ", book=" + book +
                '}';
    }
}
