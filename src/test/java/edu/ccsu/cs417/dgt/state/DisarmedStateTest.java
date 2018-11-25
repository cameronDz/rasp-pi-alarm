package edu.ccsu.cs417.dgt.state;

import edu.ccsu.cs417.dgt.strategy.UserNotification;
import org.junit.Test;

/**
 * TODO write tests to pass
 * @author curti
 */
public class DisarmedStateTest {

    /**
     * Test of arm method, of class DisarmedState.
     * @throws java.lang.Exception
     */
    @Test
    public void testArm() throws Exception {
        System.out.println("arm");
        UserNotification notifier = null;
        DisarmedState instance = null;
        instance.arm(notifier);
    }

    /**
     * Test of disarm method, of class DisarmedState.
     */
    @Test
    public void testDisarm() {
        System.out.println("disarm");
        DisarmedState instance = null;
        instance.disarm();
    }
}
