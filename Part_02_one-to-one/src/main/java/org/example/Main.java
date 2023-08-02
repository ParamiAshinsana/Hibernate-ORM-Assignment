package org.example;

import org.example.entity.Author;
import org.example.entity.Book;
import org.example.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Author author01 = new Author();
        author01.setAuthor_id("A001");
        author01.setAuthor_name("Sendrick");

        Book book01 = new Book();
        book01.setId("B001");
        book01.setISBN("452-45-00-785-01");
        book01.setTitle("The Mango Tree");
        book01.setAuthor(author01);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        //session.persist(author01);
        System.out.println("Successfully saved "+author01.getAuthor_id());
        //session.persist(book01);
        System.out.println("Successfully saved "+book01.getId());

        System.out.println("\n");

        Book bookPrint01 = session.get(Book.class,"B001");
        System.out.println(bookPrint01);

        System.out.println("\n");

        Author authorPrint02 = session.get(Author.class,"A001");
        System.out.println(authorPrint02);

        transaction.commit();
        session.close();

    }
}
