package src.dnb.reskill.sigbjorn.chap9_inheritance;

public class Book extends LibraryItem {
    private String author;
    private String genre;

    public Book(String title, String code, String author, String genre) {
        super(title, code);
        this.author = author;
        this.genre = genre;
    }
}
