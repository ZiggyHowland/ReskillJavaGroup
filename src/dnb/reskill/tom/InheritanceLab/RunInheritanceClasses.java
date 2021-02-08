package src.dnb.reskill.tom.InheritanceLab;

import java.time.Duration;
import java.util.HashMap;

public class RunInheritanceClasses {
    /*Write an abstract superclass named LibraryItem (a library item has a title and some kind of id-code).
    Write a subclass named Book. A Book is a kind of LibraryItem, with additional data (author, genre).
    Write a subclass named Film. A Film is a kind of LibraryItem, with additional data (director, rating, length).
    Write toString() functions in all the classes.
    Write some simple main() code to use your classes.*/


    private static int filmRating = 0;// TODO: make this more usefull- like an enum {BAD, GOOOD, VERY GOOD}
    private static Duration filmDuration = Duration.ofSeconds(9000);

    private static HashMap libraryItems= new HashMap();

    public static void main(String[] args) {
       libraryItems = CommonObjectHandling.createFilm(libraryItems,getLibraryKey(),"Rambo",filmDuration,"Sylvester Stallone",filmRating+2);
       libraryItems = CommonObjectHandling.createFilm(libraryItems,getLibraryKey(),"Rambo 2",filmDuration,"Sylvester Stallone",filmRating);
       libraryItems = CommonObjectHandling.createBook(libraryItems,getLibraryKey(),"A view to paradise","Ingvar Ambjornsen","Fiction");
       libraryItems = CommonObjectHandling.createBook(libraryItems,getLibraryKey(),"Innocentia Park","Ingvar Ambjornsen","Fiction");
       libraryItems =CommonObjectHandling.createFilm(libraryItems,getLibraryKey(),"Rambo 3",filmDuration,"Sylvester Stallone",filmRating+1);

       CommonObjectHandling.displayLibrary(libraryItems);
    }
    public static int getLibraryKey(){
        if (libraryItems.isEmpty()){
            return 1;
        }
        else{
            return libraryItems.size()+1;
        }

    }
}
