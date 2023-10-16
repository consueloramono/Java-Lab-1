package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void showAllBooks() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("111", "111", "111", "111"));
        books.add(new Book("222", "222", "222", "222"));
        books.add(new Book("333", "333", "333", "333"));
        Book.showAllBooks(books);
    }

    @Test
    void findBook() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("111", "111", "111", "111"));
        books.add(new Book("222", "222", "222", "222"));
        books.add(new Book("333", "333", "333", "333"));
        boolean result = Book.findBook(books, "123");
        assertFalse(result);

        result = Book.findBook(books, "111");
        assertTrue(result);
    }

    @Test
    void removeBook() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("111", "111", "111", "111"));
        books.add(new Book("222", "222", "222", "222"));
        books.add(new Book("333", "333", "333", "333"));
        assertTrue(Book.removeBook(books, "111"));
        assertFalse(Book.removeBook(books, "123"));
    }

}