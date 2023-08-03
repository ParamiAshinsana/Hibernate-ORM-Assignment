package org.example;

import org.example.entity.Author;
import org.example.entity.Book;
import org.example.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main_O_O {
    public static void main(String[] args) {
        Author author01 = new Author();
        author01.setAuthor_id("A001");
        author01.setAuthor_name("Sendrick");

        Author author02 = new Author();
        author02.setAuthor_id("A002");
        author02.setAuthor_name("J.K.Winston");

        Book book01 = new Book();
        book01.setId("B001");
        book01.setISBN("452-45-00-785-01");
        book01.setTitle("The Mango Tree");
        book01.setAuthor(author01);

        Book book02 = new Book();
        book02.setId("B002");
        book02.setISBN("389-33-00-785-01");
        book02.setTitle("The Zombies Island");
        book02.setAuthor(author02);

        Book book03 = new Book();
        book03.setId("B002");
        book03.setISBN("389-33-00-785-01");
        book03.setTitle("The Zombies Island");
        book03.setAuthor(author01);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.persist(author01);
        System.out.println("Successfully saved "+author01.getAuthor_id());
        session.persist(author02);
        System.out.println("Successfully saved "+author02.getAuthor_id());

        session.persist(book01);
        System.out.println("Successfully saved "+book01.getId());
        session.persist(book02);
        System.out.println("Successfully saved "+book02.getId());

        transaction.commit();
        session.close();

    }
}
