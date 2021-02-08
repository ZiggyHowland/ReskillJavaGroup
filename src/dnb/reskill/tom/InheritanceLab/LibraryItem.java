package src.dnb.reskill.tom.InheritanceLab;

import com.sun.jdi.request.StepRequest;

public abstract class LibraryItem {
      /*Write an abstract superclass named LibraryItem (a library item has a title and some kind of id-code).
    Write a subclass named Book. A Book is a kind of LibraryItem, with additional data (author, genre).
    Write a subclass named Film. A Film is a kind of LibraryItem, with additional data (director, rating, length).
    Write toString() functions in all the classes.
    Write some simple main() code to use your classes.*/

    private static int libraryItemId;
    private static String libraryItemTitle;

    public LibraryItem(int libraryItemId, String libraryItemTitle) {
        this.libraryItemId = libraryItemId;
        this.libraryItemTitle = libraryItemTitle;
    }

    public static String getLibraryItemTitle() {
        return libraryItemTitle;
    }
/*
    public static String toString(){
        return String.format("%d %s", libraryItemId, libraryItemTitle);
    }

 */

}