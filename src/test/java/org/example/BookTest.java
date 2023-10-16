package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BookLibraryTest {

    @Test
    void addBook() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("111", "111", "111", "111");
        bookLibrary.addBook(book);
        assertTrue(bookLibrary.findBook(book.name));
    }

    @Test
    void showAllBooks() {
        BookLibrary bookLibrary = new BookLibrary();
        bookLibrary.addBook(new Book("111", "111", "111", "111"));
        bookLibrary.addBook(new Book("222", "222", "222", "222"));
        bookLibrary.addBook(new Book("333", "333", "333", "333"));
        bookLibrary.showAllBooks();
    }

    @Test
    void findBook() {
        BookLibrary bookLibrary = new BookLibrary();
        bookLibrary.addBook(new Book("111", "111", "111", "111"));
        bookLibrary.addBook(new Book("222", "222", "222", "222"));
        bookLibrary.addBook(new Book("333", "333", "333", "333"));

        boolean result = bookLibrary.findBook("123");
        assertFalse(result);

        result = bookLibrary.findBook("111");
        assertTrue(result);
    }

    @Test
    void removeBook() {
        BookLibrary bookLibrary = new BookLibrary();
        bookLibrary.addBook(new Book("111", "111", "111", "111"));
        bookLibrary.addBook(new Book("222", "222", "222", "222"));
        bookLibrary.addBook(new Book("333", "333", "333", "333"));

        assertTrue(bookLibrary.removeBook("111"));
        assertFalse(bookLibrary.removeBook("123"));
    }
}