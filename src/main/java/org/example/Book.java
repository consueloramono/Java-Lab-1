package org.example;

import java.util.ArrayList;

public class Book {
    private final String year;
    private final String isbn;
    private final String author;
    private final String name;

    public Book(String name, String author, String isbn, String year) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
    }

    public void ShowBook() {
        System.out.println("Name: " + this.name);
        System.out.println("Author: " + this.author);
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Year: " + this.year);
    }

    public static void ShowAllBooks(ArrayList<Book> books) {
        for (Book book : books) {
            book.ShowBook();
            System.out.println();
        }
    }
    public static boolean FindBook(ArrayList<Book> books, String BookName){
        for(Book book : books){
            if(book.name.equals(BookName)){
                book.ShowBook();
                return true;
            }
        }
        System.out.println("Не знайдено книжки з такою назвою!");
        return false;
    }
    public static boolean RemoveBook(ArrayList<Book> books, String Query){
        int index = 0;
        for(Book book : books){
            if(book.isbn.equals(Query)){
                break;
            }
            index++;
        }
        if(index == books.size()){
            System.out.println("Не знайдено книжки з таким номером ISBN!");
            return false;
        }
        books.remove(index);
        System.out.println("Книжку з номером " + Query + " видалено!");
        return true;
    }
}



