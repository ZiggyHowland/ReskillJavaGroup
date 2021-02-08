package src.dnb.reskill.tom.InheritanceLab;

public class Book extends LibraryItem {
    private String author;
    private String genre;

    public Book(int libraryItemId, String libraryItemTitle, String author, String genre) {
        super(libraryItemId, libraryItemTitle);
        this.author = author;
        this.genre = genre;
    }
    public String toString(){
        return String.format("%s %s", author, genre);

    }

}
