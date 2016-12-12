
package edu.ccsu.cs417.group2.finalproject.strategy;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author curti
 */
public class UserNotificationTest {
    
    private final static ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    
    public UserNotificationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }
    
    @After
    public void tearDown() {
        System.setOut(null);
    }

    /**
     * Test of changeStrategy method, of class UserNotification.
     */
    @Test
    public void testChangeStrategy() {
        System.out.println("changeStrategy");
        UserNotificationStrategy strategy = new BuzzerStrategy();
        UserNotification instance = new UserNotification(new SilentStrategy());
        instance.changeStrategy(strategy);
        //Only silent strategy prints this output
        assertTrue(outContent.toString().contains("Intruder detected!"));
    }

    /**
     * Test of notifyUser method, of class UserNotification.
     */
    @Test
    public void testNotifyUser() throws InterruptedException, IOException {
        System.out.println("notifyUser");
        UserNotification instance = new UserNotification(new SilentStrategy());
        try {
            instance.notifyUser();
        } catch(IOException ex) {
            fail("IOException reported: " + ex.getMessage());
        } catch(InterruptedException ex) {
            fail("InterruptedException reported: " + ex.getMessage());
        }
        //Test passes if no exceptions thrown
        assertTrue(true);
    }
    
}
