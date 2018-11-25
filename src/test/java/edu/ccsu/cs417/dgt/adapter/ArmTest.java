package edu.ccsu.cs417.dgt.adapter;

import edu.ccsu.cs417.dgt.strategy.SilentStrategy;
import edu.ccsu.cs417.dgt.strategy.UserNotification;
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ngreeshdfg
 */
public class ArmTest {

    /**
     * Test of activate method, of class Arm.
     * @throws Exception
     */
    @Test
    public void testActivate() throws Exception {
        System.out.println("activate");
        UserNotification notifier = new UserNotification(new SilentStrategy());
        Arm instance = new Arm();
        String expResult = "";
        String result = instance.activate(notifier);
        try {
            result = instance.activate(notifier);
        } catch(IOException ex) {
            fail("IOException reported: " + ex.getMessage());
        }
        assertEquals(expResult, result);
    }
}
