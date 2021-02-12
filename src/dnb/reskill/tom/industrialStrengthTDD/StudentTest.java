package dnb.reskill.tom.industrialStrengthTDD;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.*;

public class StudentTest {

    private Student testStudent;
    private UUID studentID;
    @Before
    public void setUp(){
        studentID = UUID.randomUUID();
        testStudent= new Student (studentID,"Mark");
    }

    @Test
    public void initial_test_bookSlot() {
        assertEquals(6,testStudent.getBookSlotsAvailable());
    }

    @Test
    public void use_all_bookSlot(){
        testStudent.bookSlot();
        testStudent.bookSlot();
        testStudent.bookSlot();
        testStudent.bookSlot();
        testStudent.bookSlot();
        testStudent.bookSlot();
        assertEquals(0,testStudent.getBookSlotsAvailable());


    }
    @Test
    public void no_available_bookSlot() {
        testStudent.bookSlot();
        testStudent.bookSlot();
        testStudent.bookSlot();
        testStudent.bookSlot();
        testStudent.bookSlot();
        testStudent.bookSlot();
        assertEquals(false,testStudent.bookSlot());
    }
    @Test
    public void available_bookSlot() {
        assertEquals(true,testStudent.bookSlot());
    }
    @Test
    public void bookslots_at_maximum_releaseSlot() {
        assertEquals(false,testStudent.releaseSlot());
    }
    @Test
    public void bookslots_available_for_releaseSlot() {
        testStudent.bookSlot();
        assertEquals(true,testStudent.releaseSlot());
    }
    @Test
    public void testToString() {
        testStudent.bookSlot();
        testStudent.bookSlot();
        testStudent.bookSlot();
        testStudent.bookSlot();
        assertEquals("Student{" + studentID + "studentName='Mark', bookSlotsAvailable=2}",testStudent.toString());
    }
}