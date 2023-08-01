package org.example;
import org.example.entity.Book;
import org.example.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Book book01 = new Book();
        book01.setId("B001");
        book01.setISBN("978-3-16-148410-0");
        book01.setTitle("The Sky");
        book01.setAuthor("J.K.John");

        Book book02 = new Book();
        book02.setId("B002");
        book02.setISBN("201-3-16-148410-0");
        book02.setTitle("Mother");
        book02.setAuthor("Stiwon Gross");

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        //session.persist(book01);
        System.out.println("Successfully saved "+book01.getId());

        //session.persist(book02);
        System.out.println("Successfully saved "+book02.getId());

        System.out.println("\n");

        Book bookS01 = session.get(Book.class,"B001");
        System.out.println(bookS01);

        System.out.println("\n");

        Book bookS02 = session.get(Book.class,"B002");
        System.out.println(bookS02);

        transaction.commit();
        session.close();
    }
}
