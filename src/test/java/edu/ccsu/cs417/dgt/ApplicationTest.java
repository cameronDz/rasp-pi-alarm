package edu.ccsu.cs417.dgt;

import java.sql.Timestamp;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Cameron
 */
public class ApplicationTest {
    
    @Test
    public void testGetDateInteger() {
        Timestamp timestamp = Timestamp.valueOf("1995-05-01 05:45:11");
        int expected = 19950501;
        int actual = Application.getDateInteger(timestamp);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetTimeInteger() {
        Timestamp timestamp = Timestamp.valueOf("1995-05-01 05:45:11");
        int expected = 54511;
        int actual = Application.getTimeInteger(timestamp);
        assertEquals(expected, actual);
    }
}
