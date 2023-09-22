package org.example;

import java.util.ArrayList;

class BookTest {

    @org.junit.jupiter.api.Test
    void showAllBooks() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("111", "111", "111", "111"));
        books.add(new Book("222", "222", "222", "222"));
        books.add(new Book("333", "333", "333", "333"));
        Book.ShowAllBooks(books);
    }

    @org.junit.jupiter.api.Test
    void findBook() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("111", "111", "111", "111"));
        books.add(new Book("222", "222", "222", "222"));
        books.add(new Book("333", "333", "333", "333"));
        Book.ShowAllBooks(books);
        System.out.println("Очікування: Помилка\n" +
                "Результат: ");

        Book.FindBook(books, "123");
        System.out.println("Очікування: Знайдено\n" +
                "Результат: ");
        Book.FindBook(books, "111");
    }

    @org.junit.jupiter.api.Test
    void removeBook() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("111", "111", "111", "111"));
        books.add(new Book("222", "222", "222", "222"));
        books.add(new Book("333", "333", "333", "333"));
        Book.RemoveBook(books, "123");
        System.out.println("Очікування: Видалення\n" +
                "Результат: ");
        Book.RemoveBook(books, "111");
        System.out.println("Очікування: Помилка\n" +
                "Результат: ");
    }

}