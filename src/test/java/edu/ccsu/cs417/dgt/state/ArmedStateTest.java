package edu.ccsu.cs417.dgt.state;

import edu.ccsu.cs417.dgt.strategy.UserNotification;
import org.junit.Test;

/**
 * TODO write tests to pass
 * @author curti
 */
public class ArmedStateTest {

    /**
     * Test of arm method, of class ArmedState.
     */
    @Test
    public void testArm() {
        System.out.println("arm");
        UserNotification notifier = null;
        ArmedState instance = null;
        instance.arm(notifier);
    }

    /**
     * Test of disarm method, of class ArmedState.
     */
    @Test
    public void testDisarm() {
        System.out.println("disarm");
        ArmedState instance = null;
        instance.disarm();
    }    
}
