package edu.ccsu.cs417.dgt.state;

import edu.ccsu.cs417.dgt.strategy.UserNotification;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * TODO write tests to pass
 * @author curti
 */
public class SecuritySystemTest {
    
    /**
     * Test of setDetectorState method, of class SecuritySystem.
     */
    @Test
    public void testSetDetectorState() {
        System.out.println("setDetectorState");
        DetectorState newDetectorState = null;
        SecuritySystem instance = new SecuritySystem();
        instance.setDetectorState(newDetectorState);
    }

    /**
     * Test of arm method, of class SecuritySystem.
     * @throws Exception
     */
    @Test
    public void testArm() throws Exception {
        System.out.println("arm");
        UserNotification notifier = null;
        SecuritySystem instance = new SecuritySystem();
        instance.arm(notifier);
    }

    /**
     * Test of disarm method, of class SecuritySystem.
     */
    @Test
    public void testDisarm() {
        System.out.println("disarm");
        SecuritySystem instance = new SecuritySystem();
        instance.disarm();
    }

    /**
     * Test of getIsArmedState method, of class SecuritySystem.
     */
    @Test
    public void testGetIsArmedState() {
        System.out.println("getIsArmedState");
        SecuritySystem instance = new SecuritySystem();
        DetectorState expResult = null;
        DetectorState result = instance.getIsArmedState();
        assertEquals(expResult, result);
    }

    /**
     * Test of getIsDisarmedState method, of class SecuritySystem.
     */
    @Test
    public void testGetIsDisarmedState() {
        System.out.println("getIsDisarmedState");
        SecuritySystem instance = new SecuritySystem();
        DetectorState expResult = null;
        DetectorState result = instance.getIsDisarmedState();
        assertEquals(expResult, result);
    }
}
