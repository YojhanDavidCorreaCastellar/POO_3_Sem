package Taller_1;

public class Book {
    String title;
    String author;
    int numPages;

    public Book(String title, String author, int numPages) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
    }

    public Book() {
        this.title = "La divina comedia";
        this.author = "Yojhan Correa";
        this.numPages = 300;
    }

    public void showInfo() {
        System.out.println("--- BOOK INFO ---");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages number: " + numPages);
    }
}
