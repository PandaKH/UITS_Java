
package jv1607.homeworks.task_0.task_5;;

import java.util.Random;

public class App {
    static Book[] book = {
        new Book(1, "Евшений Онегин", "Пушкин", "Книга", 1833, 192, 75, "мягкий"),
        new Book(2, "Капитанская дочка", "Пушкин", "Азбука", 1836, 157, 90, "твердый" ),
        new Book(3, "Тёмные аллеи", "Бунин", "Азбука", 1943, 202, 110, "твердный"),
        new Book(4, "Мёртвые души", "Гоголь", "Азбука", 1842, 206, 105, "мягкий")
    };
    public static void main(String[] args) {
        print(book);
        System.out.println("");
        author(book, "Пушкин");
        System.out.println("");
        publishing(book, "Азбука");
        System.out.println("");
        year(book, 1840);
    }
    
    public static void print(Book[] book){
        for(int i=0; i<book.length; i++){
            System.out.println(book[i]);
        }
    }
    public static void author(Book[] book, String auth){
        System.out.println("Список книг заданного автора - " + auth + " :");
        for(int i=0; i<book.length; i++){
            if(book[i].getAuthor()==auth){
                System.out.println(book[i]);
            }
        }
    }
    public static void publishing(Book[] book, String publish){
        System.out.println("Список книг заданного издательства - " + publish + " :");
        for(int i=0; i<book.length; i++){
            if(book[i].getPublishing()==publish){
                System.out.println(book[i]);
            }
        }
    }
    public static void year(Book[] book, int year){
        System.out.println("Список книг после заданного года - " + year + " :");
        for(int i=0; i<book.length; i++){
            if(book[i].getYear()>year){
                System.out.println(book[i]);
            }
        }
    }
}
