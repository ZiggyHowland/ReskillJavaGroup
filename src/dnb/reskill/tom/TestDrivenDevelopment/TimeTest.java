package dnb.reskill.tom.TestDrivenDevelopment;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.validator.PublicClassValidator;

import static org.junit.Assert.*;

public class TimeTest {


    @Test
    @Ignore
    public void constructor_exactly_at_midnight(){
        Time testTime = new Time();
        assertEquals(testTime.getHour(),0);
        assertEquals(testTime.getMinute(),0);
        assertEquals(testTime.getSecond(),0);
    }
    //This one fails
    @Test
    @Ignore
    public void constructor_five_hours_thirty_minutes_after_midnight(){
        Time testTime = new Time(5,30,0);
        assertEquals(testTime.getHour(),5);
        assertEquals(testTime.getMinute(),30);
        assertEquals(testTime.getSecond(),0);
    }
    @Test
    public void constructor_invalid_input(){

    }


    @Test
    @Ignore
    public void test_time_add() {
    }

    @Test
    @Ignore
    public void test_testEquals() {
    }

    @Test
    @Ignore
    public void test_time_HashCode() {
    }

    @Test
    @Ignore
    public void test_time_ToString() {
    }
}