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

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        //session.persist(author01);
        //System.out.println("Successfully saved "+author01.getAuthor_id());
        //session.persist(author02);
        //System.out.println("Successfully saved "+author02.getAuthor_id());

        //session.persist(book01);
        //System.out.println("Successfully saved "+book01.getId());
        //session.persist(book02);
        //System.out.println("Successfully saved "+book02.getId());

        //System.out.println("\n");

        //Book bookPrint01 = session.get(Book.class,"B001");
        //System.out.println(bookPrint01);

        //System.out.println("\n");

        //Author authorPrint02 = session.get(Author.class,"A001");
        //System.out.println(authorPrint02);

//        session.remove(author01);
//        System.out.println("Successfully deleted "+author01.getAuthor_id());
//        session.remove(book01);
//        System.out.println("Successfully deleted "+book01.getId());

        Author authorUp01 = session.get(Author.class,"A001");
        Book bookUp01 = session.get(Book.class,"B001");
        if(bookUp01!=null && authorUp01!=null){
            author01.setAuthor_name("J.K.Winston");

            book01.setISBN("389-33-00-785-01");
            book01.setTitle("The Zombies Island");
            book01.setAuthor(author02);

            transaction.commit();
            System.out.println("Successfully updated "+author01.getAuthor_id());
            System.out.println("Successfully updated "+book01.getId());
        }

        //transaction.commit();
        session.close();

    }
}
