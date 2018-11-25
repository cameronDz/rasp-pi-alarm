package edu.ccsu.cs417.dgt.logger;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 *
 * @author ngreeshdfg
 */
public class LoggingServiceTest {
    
    private final LoggingService INSTANCE = LoggingService.getInstance();
    
    /**
     * Test of getInstance method, of class LoggingService.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        LoggingService result = LoggingService.getInstance();
        assertThat(result, instanceOf(LoggingService.class));
    }

    /**
     * Test of addLog method, of class LoggingService.
     */
    @Test
    public void testAddLog() {
        System.out.println("addLog");
        BasicLog l = new BasicLog(1, 2);
        INSTANCE.addLog(l);
        assertEquals("1 2 No message.\n" + "1 2 No message.\n", INSTANCE.toString());
    }
    
    /**
     * Test of getLogs method, of class LoggingService.
     */
    @Test
    public void testGetLogs() {
        System.out.println("getLogs");
        String expResult = "1 2 No message.\n";
        String result = INSTANCE.toString();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of toString method, of class LoggingService.
     */
    @Test
    public void testToStringLog() {
        System.out.println("toString");
        BasicLog l = new BasicLog(1, 2);
        INSTANCE.addLog(l);
        String expResult = "1 2 No message.\n";
        String result = INSTANCE.toString();
        assertEquals(expResult, result);
    }    
}
