package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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
        Book.showAllBooks(books);
        System.out.println("Очікування: Помилка\n" +
                "Результат: ");

        Book.findBook(books, "123");
        System.out.println("Очікування: Знайдено\n" +
                "Результат: ");
        Book.findBook(books, "111");
    }

    @Test
    void removeBook() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("111", "111", "111", "111"));
        books.add(new Book("222", "222", "222", "222"));
        books.add(new Book("333", "333", "333", "333"));
        Book.removeBook(books, "123");
        System.out.println("Очікування: Видалення\n" +
                "Результат: ");
        Book.removeBook(books, "111");
        System.out.println("Очікування: Помилка\n" +
                "Результат: ");
    }

}