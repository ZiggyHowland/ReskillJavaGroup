package dnb.reskill.sigbjorn.chap9_inheritance;


import java.util.Date;


// Answer from Lab: Abstract because this class is not containing sufficient data and methods to be instanciated
public abstract class LibraryItem {
    protected String itemCode;
    protected String title;
    protected Date dateBorrowed = null;
    private Member currentBorrower = null;

    public LibraryItem(String title, String code) {
        this.itemCode = code;
        this.title = title;
    }


    /*
     * -------------------------------------------
     * Private instance methods
     * -------------------------------------------
     */

    private void updateBorrower(Date d, Member m){
        if (m == null) {
            this.currentBorrower.returnedItem();
        }
        else {
            m.borrowedItem();
        }

        this.dateBorrowed = d;
        this.currentBorrower = m;
    }

    /*
     * -------------------------------------------
     * Public instance methods
     * -------------------------------------------
     */


    public boolean isBorrowed() {
        return currentBorrower != null;
    }

    public boolean canBeBorrowedBy(Member m){
        return true; // Default value. May be overriden by sub classes
    }

    /**
     *
     * @param m A Member object
     * @return Returns whether the borrow succeeded.
     */
    public boolean borrowItemBy(Member m){
        if (this.isBorrowed()) {
            return false;
        }
        else {
            if (this.canBeBorrowedBy(m)) {
                this.updateBorrower(new Date(), m);
                return true;
            }
            else {
                return false;
            }
        }
    }

    public void returnItem() {
        if (this.isBorrowed()) {
            this.updateBorrower(null, null);
        }
    }

    /**
     *
     * @return Return a string on DD.MM.YYYY format
     */
    public abstract String dateDueBack();


    @Override
    public String toString() {
        return String.format("Title: '%s' (%s). %s.",
                this.title,
                this.itemCode,
                this.isBorrowed() ? String.format("Borrowed (Due: %s)", this.dateDueBack() ) : "Available");
    }
}
