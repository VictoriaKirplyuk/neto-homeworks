package dev.victoria;

public class Book {
    private static int BID = 3;

    private String title;
    private String releaseYear;
    private int pages;
    private Author author;

    public Book(String title, String releaseYear, Author author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.pages = pages;
        this.author = author;
    }

    public boolean isBig() {
        return pages > 500;
    }

    public boolean matches(String word) {
        return title.contains(word)
                || author.getName().contains(word)
                || author.getSurname().contains(word);
    }

    public int estimatePrice() {
        int price = (int) Math.floor(pages * BID * Math.sqrt(author.getRating()));

        return Math.max(price, 250);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", releaseYear='" + releaseYear + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                '}';
    }
}
