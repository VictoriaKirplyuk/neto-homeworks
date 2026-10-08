package dev.victoria;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Питер", "Боланд", 4);
        Author author2 = new Author("Александра", "Маринина", 5);

        Book book = new Book("Ванильный убийца", "2026", author, 558);
        Book book2 = new Book("Люди за спиной", "2024", author2, 101);

        System.out.println(book.estimatePrice());
        System.out.println(book2.estimatePrice());

        System.out.println(book.matches("Питер"));
        System.out.println(book2.matches("Сара"));
    }
}