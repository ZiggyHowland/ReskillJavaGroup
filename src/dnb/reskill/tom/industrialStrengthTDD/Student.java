package dnb.reskill.tom.industrialStrengthTDD;

//  import lombok.Data;

import java.util.UUID;

public class Student {


    private UUID StudentID;
    private String studentName;
    private int bookSlotsAvailable=6;
    private static int MAXIMUM_BOOKABLE_SLOTS = 6;

    //@Data


    public Student(UUID studentID, String studentName) {
        StudentID = studentID;
        this.studentName = studentName;
        this.bookSlotsAvailable = bookSlotsAvailable;
    }

    public boolean bookSlot(){
        if (bookSlotsAvailable > 0) {
            bookSlotsAvailable--;
            return true;
        }
        else {
            return false;
        }
    }
    public boolean releaseSlot(){
        if (bookSlotsAvailable < MAXIMUM_BOOKABLE_SLOTS) {
            bookSlotsAvailable++;
            return true;
        }
        else {
            return false;
        }
    }
    public int getBookSlotsAvailable(){
        return bookSlotsAvailable;
    }
    public UUID getStudentID() {
        return StudentID;
    }
    public String getStudentName(){
        return studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentID=" + StudentID +
                ", studentName='" + studentName + '\'' +
                ", bookSlotsAvailable=" + bookSlotsAvailable +
                '}';
    }
}
