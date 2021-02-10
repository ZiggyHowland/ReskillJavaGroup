package dnb.reskill.sigbjorn.chap11_exceptions;

import java.time.Instant;

// TODO: Write a CompanyException class, to represent any company-related exceptions.
public class CompanyException extends RuntimeException {
    private String employeeId;
    private Instant timestamp;


    public CompanyException(String message, String employeeId, Throwable cause) {
        super(message, cause);
        this.employeeId = employeeId;
        this.timestamp = Instant.now();
    }

    public CompanyException(String message, String employeeId) {
        this(message, employeeId, null);
    }


}