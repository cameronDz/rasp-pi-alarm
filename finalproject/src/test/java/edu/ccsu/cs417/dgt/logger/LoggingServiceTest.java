package edu.ccsu.cs417.dgt.logger;

import edu.ccsu.cs417.dgt.logger.BasicLog;
import edu.ccsu.cs417.dgt.logger.LoggingService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 *
 * @author ngreeshdfg
 */
public class LoggingServiceTest {
    private LoggingService instance;
    
    public LoggingServiceTest() {
        instance = LoggingService.getInstance();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

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
        instance.addLog(l);
        assertEquals("1 2 No message.\n" + "1 2 No message.\n", instance.toString());
    }
    
    /**
     * Test of getLogs method, of class LoggingService.
     */
    @Test
    public void testGetLogs() {
        System.out.println("getLogs");
        String expResult = "1 2 No message.\n";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of toString method, of class LoggingService.
     */
    @Test
    public void testToStringLog() {
        System.out.println("toString");
        BasicLog l = new BasicLog(1, 2);
        instance.addLog(l);
        String expResult = "1 2 No message.\n";
        String result = instance.toString();
        assertEquals(expResult, result);
    }    
}
