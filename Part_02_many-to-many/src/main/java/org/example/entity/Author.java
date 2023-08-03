package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Author {

    @Id
    private String author_id;
    private String author_name;

    @ManyToMany
    private List<Book> bookList;

    public Author() {
    }

    public Author(String author_id, String author_name, List<Book> bookList) {
        this.author_id = author_id;
        this.author_name = author_name;
        this.bookList = bookList;
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

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "Author{" +
                "author_id='" + author_id + '\'' +
                ", author_name='" + author_name + '\'' +
                ", bookList=" + bookList +
                '}';
    }



}
