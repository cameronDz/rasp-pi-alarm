
package edu.ccsu.cs417.group2.finalproject.strategy;

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
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of changeStrategy method, of class UserNotification.
     */
    @Test
    public void testChangeStrategy() {
        System.out.println("changeStrategy");
        UserNotificationStrategy strategy = null;
        UserNotification instance = null;
        instance.changeStrategy(strategy);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of notifyUser method, of class UserNotification.
     */
    @Test
    public void testNotifyUser() {
        System.out.println("notifyUser");
        UserNotification instance = null;
        instance.notifyUser();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
