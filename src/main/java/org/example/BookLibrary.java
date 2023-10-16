package org.example;

import java.util.ArrayList;

public class BookLibrary {
    private static ArrayList<Book> books;

    public BookLibrary() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showAllBooks() {
        for (Book book : books) {
            book.showBook();
            System.out.println();
        }
    }

    public boolean findBook(String bookName) {
        for (Book book : books) {
            if (book.name.equals(bookName)) {
                book.showBook();
                return true;
            }
        }
        System.out.println("Не знайдено книжки з такою назвою!");
        return false;
    }

    public boolean removeBook(String query) {
        int index = 0;
        for (Book book : books) {
            if (book.isbn.equals(query)) {
                break;
            }
            index++;
        }
        if (index == books.size()) {
            System.out.println("Не знайдено книжки з таким номером ISBN!");
            return false;
        }
        books.remove(index);
        System.out.println("Книжку з номером " + query + " видалено!");
        return true;
    }
    public void showAllBooks(ArrayList<Book> books) {
        for (Book book : books) {
            book.showBook();
            System.out.println();
        }
    }

}
