package dnb.reskill.tom.industrialStrengthTDD;

import lombok.Data;

import java.util.UUID;

@Data
public class Student {
    public Student(UUID studentID, String studentName) {
        StudentID = studentID;
        this.studentName = studentName;
    }

    private UUID StudentID;
    private String studentName;
    private int bookSlotsAvailable=6;
    private static int MAXIMUM_BOOKABLE_SLOTS = 6;



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



}
