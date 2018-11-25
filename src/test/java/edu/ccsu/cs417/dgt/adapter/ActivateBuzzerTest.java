package edu.ccsu.cs417.dgt.adapter;

import java.io.IOException; 
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author curti
 */
public class ActivateBuzzerTest { 

    /**
     * Test of activate method, of class ActivateBuzzer.
     * @throws java.io.IOException
     */
    @Test
    public void testActivateArmBuzzerException() throws IOException {
        System.out.println("activate");
        ActivateBuzzer instance = new ArmBuzzer();
        int expResult = 0;
        int result = instance.activate();
        try {
            result = instance.activate();
        } catch(IOException ex) {
            fail("IOException reported: " + ex.getMessage());
        }
        assertEquals(expResult, result);
    }
    
    /**
     * Test of deactivate method for the buzzer
     * @throws java.io.IOException
     */
    @Test
    public void testActivateDisarmBuzzerException() throws IOException {
        System.out.println("activate");
        ActivateBuzzer instance = new ArmBuzzer();
        DisarmBuzzer test = new DisarmBuzzer();
        int expResult = 0;
        int result = instance.activate();
        try {
            result = instance.activate();
            test.deactivate();
        } catch(IOException ex) {
            fail("IOException reported: " + ex.getMessage());
        }
        assertEquals(expResult, result);
    }
}
