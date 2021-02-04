package src.dnb.reskill.sigbjorn.chap9_inheritance;

public class Film extends LibraryItem {
    private String director;
    private String rating;
    private int length; // Length in seconds

    public Film(String title, String code, String director, String rating, int length) {
        super(title, code);
        this.director = director;
        this.rating = rating;
        this.length = length;
    }
}
