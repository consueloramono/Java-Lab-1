package org.example;


public class Book {
    public final String year;
    public final String isbn;
    public final String author;
    public final String name;

    public Book(String name, String author, String isbn, String year) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
    }

    public void showBook() {
        System.out.println("Name: " + this.name);
        System.out.println("Author: " + this.author);
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Year: " + this.year);
    }
}



