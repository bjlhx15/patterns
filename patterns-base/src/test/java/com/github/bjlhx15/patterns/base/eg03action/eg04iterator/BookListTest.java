package com.github.bjlhx15.patterns.base.eg03action.eg04iterator;

import org.junit.Test;

import java.util.Iterator;

public class BookListTest {

    @Test
    public void test1() {
        BookList bookList = new BookList();

        Book book1 = new Book("001", "设计模式", 200);
        Book book2 = new Book("002", "Java核心编程", 200);
        Book book3 = new Book("003", "计算机组成原理", 200);

        bookList.addBook(book1);
        bookList.addBook(book2);
        bookList.addBook(book3);

        while (bookList.hasNext()) {
            Book book = bookList.getNext();
            book.display();
        }
    }

    @Test
    public void test2() {
        BookList bookList = new BookList();

        Book book1 = new Book("001", "设计模式", 200);
        Book book2 = new Book("002", "Java核心编程", 200);
        Book book3 = new Book("003", "计算机组成原理", 200);

        bookList.addBook(book1);
        bookList.addBook(book2);
        bookList.addBook(book3);

        for (int i = 0; i < bookList.getSize(); i++) {
            Book book = bookList.getByIndex(i);
            book.display();
        }
    }


    @Test
    public void test3() {
        BookListIterator bookList = new BookListIterator();

        Book book1 = new Book("001","设计模式",200);
        Book book2 = new Book("002","Java核心编程",200);
        Book book3 = new Book("003","计算机组成原理",200);

        bookList.addBook(book1);
        bookList.addBook(book2);
        bookList.addBook(book3);

        Iterator iterator = bookList.Iterator();
        while(iterator.hasNext()){
            Book book = (Book) iterator.next();
            book.display();
        }
    }
}