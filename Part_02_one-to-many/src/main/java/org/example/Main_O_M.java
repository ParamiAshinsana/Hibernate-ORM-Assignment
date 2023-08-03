package org.example;

import org.example.entity.Author;
import org.example.entity.Book;
import org.example.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main_O_M {
    public static void main(String[] args) {

        Book book01 = new Book();
        book01.setId("B001");
        book01.setISBN("452-45-00-785-01");
        book01.setTitle("The Mango Tree");

        Book book02 = new Book();
        book02.setId("B002");
        book02.setISBN("389-33-00-785-01");
        book02.setTitle("The Zombies Island");

        Author author01 = new Author();
        author01.setAuthor_id("A001");
        author01.setAuthor_name("Sendrick");

        List<Book> bookList = new ArrayList<>();
        bookList.add(book01);
        bookList.add(book02);

        author01.setBooks(bookList);
        book01.setAuthors(author01);
        book02.setAuthors(author01);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.persist(author01);
        session.persist(book01);
        session.persist(book02);

        transaction.commit();
        session.close();
    }
}
