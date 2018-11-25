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
public class ArmAdapterTest {

    /**
     * Test of activate method, of class ArmAdapter.
     * @throws IOException
     */
    @Test
    public void testActivate() throws IOException {
        System.out.println("activate");
        UserNotification notifier = new UserNotification(new SilentStrategy());
        ArmAdapter instance = new ArmAdapter();
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
