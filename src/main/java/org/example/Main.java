package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        ArrayList<org.example.Book> books = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int query = 5;
        while(true){
            System.out.println("""
                    Оберіть операцію:
                    1. Додати книжку.
                    2. Переглянути весь каталог книжок.
                    3. Знайти книжку за назвою.
                    4. Видалити книжку за номером ISBN.
                    0. Вийти з програми.
                    """);
            try {
                query = Integer.parseInt(s.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Помилка: Ви ввели не число");
            }
            if(query == 1){
                do {
                    System.out.println("Введіть назву книги: ");
                    String name = s.nextLine();
                    System.out.println("Введіть автора книги: ");
                    String author = s.nextLine();
                    System.out.println("Введіть рік видання книги: ");
                    String year = s.nextLine();
                    System.out.println("Введіть номер ISBN книги: ");
                    String isbn = s.nextLine();
                    books.add(new Book(name, author, isbn, year));
                    System.out.println("1. Додати наступну книгу.\n" +
                            "0. Повернутись до основного меню.");
                    while (true) {
                        try {
                            query = Integer.parseInt(s.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Помилка: Ви ввели не число.");
                        }
                        if (query == 1) break;
                        else if (query == 0) break;
                        else System.out.println("Ви ввели недопустиме значення контекстного меню!");
                    }
                } while (query != 0);
            }
            else if(query == 2){
                Book.showAllBooks(books);
            }
            else if(query == 3){
                while(true) {
                    System.out.println("Введіть назву книжки: \n" +
                            "0. Покинути меню пошуку. ");
                    String QueryName = s.nextLine();
                    if(QueryName.equals("0")) break;
                    if(Book.findBook(books, QueryName)){
                        break;
                    }
                }
            }
            else if(query == 4){
                while(true) {
                    System.out.println("Введіть номер ISBN книжки: \n" +
                            "0. Покинути меню видалення. ");
                    String QueryISBN = s.nextLine();
                    if(QueryISBN.equals("0")) break;
                    if(Book.removeBook(books, QueryISBN)){
                        break;
                    }
                }
            }
            else if(query == 0) break;
        }
    }
}