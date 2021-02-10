package dnb.reskill.tom.exceptionsassertions;

public class CompanyException extends Exception {

// TODO: Write a CompanyException class, to represent any company-related exceptions.


    private int id;

    public CompanyException(String message) {
        super(message);
    }

    public  CompanyException(String message, int id){
        super(message);
        this.id=id;

    }



}