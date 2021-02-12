package dnb.reskill.tom.industrialStrengthTDD;

import org.hamcrest.core.IsNot;
import static org.hamcrest.CoreMatchers.not;
import org.hamcrest.core.IsSame;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.*;

public class RegistryTest {
    private Registry testRegistry;
    private Student testStudent;
    private UUID studentId;
    private String studentName;

    @Before
    public void setUp()  {
        testRegistry = new Registry();
        studentName = "John";
        testStudent = testRegistry.registerStudent(studentName);
        studentId = testStudent.getStudentID();
      }

    @Test
    public void register_Student_that_does_not_Exist_test_name() {
        Student testStudentFromReturn = testRegistry.registerStudent(studentName);
        assertEquals(testStudentFromReturn.getStudentName(),"John");
    }
    @Test
    public void register_Student_that_does_not_Exist_verify_Registry() {
        Student testStudentFromReturn = testRegistry.registerStudent(studentName);
        Student testStudentfromRegistry = testRegistry.findStudent(testStudentFromReturn.getStudentID());
        assertEquals(testStudentfromRegistry,testStudentFromReturn);
        }

    @Test
    @Ignore
    public void register_Student_that_does_Exist() {

        Student testStudentFromReturn = testRegistry.registerStudent(studentName);
        Student testStudent;
        Student testStudentfromRegistry = testRegistry.findStudent(testStudentFromReturn.getStudentID());
        assertEquals(testStudentfromRegistry,testStudentFromReturn);
    }

    @Test
    public void findStudent_that_exists() {
       Student testStudentReturn = testRegistry.findStudent(studentId);
       assertEquals(testStudentReturn,testStudent);
    }

    @Test(expected=IllegalArgumentException.class)
    public void findStudent_that_does_not_exist() {
        UUID studentIdDoesNotExist = UUID.randomUUID();
        Student testStudentReturn = testRegistry.findStudent(studentIdDoesNotExist);
    }
    @Test
    public void unregisterStudent_that_exists() {
        testRegistry.unregisterStudent(studentId);
    }
    @Test(expected=IllegalArgumentException.class)
    public void unregisterStudent_that_does_not_exists() {
        testRegistry.unregisterStudent(UUID.randomUUID());
    }


    @Test
    public void getUniqueID(){
        UUID test1 = testRegistry.generateUniqueStudentID();
        UUID test2 = testRegistry.generateUniqueStudentID();
        assertThat(test1,not(test2));
    }
}