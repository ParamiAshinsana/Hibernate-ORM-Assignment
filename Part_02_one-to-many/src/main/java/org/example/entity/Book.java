package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Book {
    @Id
    private String id;
    private String ISBN;
    private String title;

    @ManyToOne
   private Author authors;

    public Book() {
    }

    public Book(String id, String ISBN, String title, Author authors) {
        this.id = id;
        this.ISBN = ISBN;
        this.title = title;
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", authors=" + authors +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthors() {
        return authors;
    }

    public void setAuthors(Author authors) {
        this.authors = authors;
    }
}
