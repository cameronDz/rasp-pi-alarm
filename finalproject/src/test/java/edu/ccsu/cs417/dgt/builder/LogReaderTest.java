package edu.ccsu.cs417.dgt.builder;

import edu.ccsu.cs417.dgt.logger.BasicLog;
import edu.ccsu.cs417.dgt.logger.LogInterface;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cameron
 */
public class LogReaderTest {

    /**
     * Test of parseLog method, of class LogReader.
     */
    @Test
    public void testParseLog() {
        System.out.println("parseLog");
        LogInterface log = new BasicLog(123, 234, "Message.");
        LogBuilder builder = new JsonLogBuilder();
        LogReader instance = new LogReader(builder);
        instance.parseLog(log);
        
        String expResult = "LogReader:\n" + "JsonLogBuilder:\n" +
                "{\"date\": 123, \"time\": 234, \"messsage\": \"Message.\"";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBuilder method, of class LogReader.
     */
    @Test
    public void testGetBuilder() {
        System.out.println("getBuilder");
        LogBuilder builder = new JsonLogBuilder();
        LogReader instance = new LogReader(builder);
        LogBuilder expResult = builder;
        LogBuilder result = instance.getBuilder();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class LogReader.
     */
    @Test
    public void testToString() {
        System.out.println("toString-empty");
        LogBuilder builder = new JsonLogBuilder();
        LogReader instance = new LogReader(builder);
        String expResult = "LogReader:\n" + "JsonLogBuilder:\n" + null;
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of hashCode method, of class LogReader.
     */
    @Test
    public void testHashCodeNull() {
        System.out.println("hashCode-null");
        LogBuilder builder = null;
        LogReader instance = new LogReader(builder);
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of hashCode method, of class LogReader.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        LogInterface log = new BasicLog(123, 234, "Message");
        LogBuilder builder = new JsonLogBuilder();
        LogReader instance = new LogReader(builder);
        instance.parseLog(log);
        int expResult = builder.hashCode();
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class LogReader.
     */
    @Test
    public void testEqualsNullFalse() {
        System.out.println("equals-null-false");
        Object obj = new Object();
        LogBuilder builder = new JsonLogBuilder();
        LogReader instance = new LogReader(builder);
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
}
