package dnb.reskill.tom.InheritanceLab;

import java.time.Duration;
import java.util.HashMap;

public class CommonObjectHandling {

    //TODO:make this method generic so it can take both book and film
    public static HashMap createFilm(HashMap map,int libraryKey, String filmTitle, Duration filmDuration, String filmDirector, int filmRating){
        Film newFilm = new Film(libraryKey,filmTitle,filmDirector,filmRating,filmDuration);
        System.out.println(newFilm.toString());
        return addObjectToLibrary(newFilm,libraryKey,map);

    }
    public  static HashMap createBook(HashMap libraryItems,int libraryKeys,String bookTitle,String author, String genre){
        Book newBook = new Book(libraryKeys,bookTitle,author,genre);
        System.out.println(newBook);
        return addObjectToLibrary(newBook, libraryKeys, libraryItems);
    }
    public static  <T> HashMap addObjectToLibrary(T objectToAdd,int libraryKey, HashMap libraryItems){
        libraryItems.put(libraryKey,objectToAdd);
        return libraryItems;
    }
    public static void displayLibrary(HashMap libraryItems){
        System.out.println(libraryItems);
    }
}
