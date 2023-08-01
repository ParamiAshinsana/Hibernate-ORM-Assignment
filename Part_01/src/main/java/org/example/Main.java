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
        session.persist(book01);
        session.persist(book02);
        transaction.commit();
        session.close();
    }
}
