package src.dnb.reskill.sigbjorn.chap9_inheritance;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Book extends LibraryItem {
    private String author;
    private String ISBN;
    private Genre genre;

    private final int NUM_OF_DAYS_TO_BORROW = 21; // Could this be declared abstract in superclass an implemented here?

    public enum Genre { CHILDREN, FICTION, NON_FICTION };

    public Book(String title, String code, String author, String ISBN, Genre genre) {
        super(title, code);
        this.author = author;
        this.ISBN = ISBN;
        this.genre = genre;
    }

    @Override
    public boolean canBeBorrowedBy(Member m) {
        switch (this.genre) {
            case CHILDREN:
                return m.isChild();

            default:
                return true;
        }
    }

    public String dateDueBack() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(super.dateBorrowed);
        cal.add(Calendar.DATE, NUM_OF_DAYS_TO_BORROW); // Can constants be made abstract and not declared in superclass???
        return new SimpleDateFormat("dd.MM.yyyy").format(cal.getTime());
    }


    @Override
    public String toString() {
        return String.format("(Book) %s \nAuthor: %s \nISBN: %s",
                super.toString(),
                this.author,
                this.ISBN);
    }
}
