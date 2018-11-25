package edu.ccsu.cs417.dgt.strategy;

import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author curti
 */
public class LightStrategyTest {

    /**
     * Test of execute method, of class LightStrategy.
     * @throws Exception
     */
    @Test
    public void testExecute() throws Exception {
        System.out.println("execute");
        LightStrategy instance = new LightStrategy();
        try {
            instance.execute();
        } catch(IOException ex) {
            fail("IOException reported: " + ex.getMessage());
        } catch(InterruptedException ex) {
            fail("InterruptedException reported: " + ex.getMessage());
        }
        //Test passes if no exceptions thrown
        assertTrue(true);
    }
}
