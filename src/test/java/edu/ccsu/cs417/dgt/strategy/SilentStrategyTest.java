package edu.ccsu.cs417.dgt.strategy;

import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author curti
 */
public class SilentStrategyTest {

    /**
     * Test of execute method, of class SilentStrategy.
     * @throws java.lang.InterruptedException
     * @throws java.io.IOException
     */
    @Test
    public void testExecute() throws InterruptedException, IOException {
        System.out.println("execute");
        SilentStrategy instance = new SilentStrategy();
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