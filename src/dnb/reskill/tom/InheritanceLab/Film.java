package dnb.reskill.tom.InheritanceLab;


import java.time.Duration;
public class Film extends LibraryItem{

    private String director;
    //private enum rating{BAD,OK,GOOD} TODO:Implement this later
    private int rating;
    private Duration filmDuration;

    public Film(int libraryItemId, String libraryItemTitle, String director, int rating, Duration filmDuration) {
        super(libraryItemId, libraryItemTitle);
        this.director = director;
        this.rating = rating;
        this.filmDuration = filmDuration;
    }
    public String toString(){
        return String.format("%S %s %d %s " ,LibraryItem.getLibraryItemTitle(),director, rating,filmDuration.toString().replaceFirst("PT",""));
    }
}
