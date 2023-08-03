package org.example;

import org.example.entity.Author;
import org.example.entity.Book;
import org.example.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main_M_M {
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

        Book book02 = new Book();
        book02.setId("B002");
        book02.setISBN("389-33-00-785-01");
        book02.setTitle("The Zombies Island");

        List<Author> authorList = new ArrayList<>();
        authorList.add(author01);
        authorList.add(author02);

        List<Book> bookList = new ArrayList<>();
        bookList.add(book01);
        bookList.add(book02);

        author01.setBookList(bookList);
        author02.setBookList(bookList);

        book01.setAuthorList(authorList);
        book02.setAuthorList(authorList);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();


//        session.persist(author01);
//        session.persist(author02);
//
//        session.persist(book01);
//        session.persist(book02);
//
//        transaction.commit();
//        session.close();


        //print the details

//        Session session = FactoryConfiguration.getInstance().getSession();
//        Transaction transaction = session.beginTransaction();
//
//        System.out.println("\n");
//
        //Book bookPrint01 = session.get(Book.class,"B001");
        //System.out.println(bookPrint01);

//        System.out.println("\n");
//
//        Book bookPrint02 = session.get(Book.class,"B002");
//        System.out.println(bookPrint02);

//        System.out.println("\n");

//        Author authorPrint01 = session.get(Author.class,"A001");
//        System.out.println(authorPrint01);
//
//        System.out.println("\n");
//
//        Author authorPrint02 = session.get(Author.class,"A001");
//        System.out.println(authorPrint02);

        //transaction.commit();
        //session.close();



        //delete
//        Session session = FactoryConfiguration.getInstance().getSession();
//        Transaction transaction = session.beginTransaction();
//
//        session.remove(author01);
//        session.remove(author02);
//
//        session.remove(book01);
//        session.remove(book02);
//
//        transaction.commit();
//        session.close();


        //update




    }
}
