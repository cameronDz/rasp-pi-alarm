package edu.ccsu.cs417.dgt.adapter;

import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tom
 */
public class ArmLEDTest {

    /**
     * Test of activate method, of class ArmLED.
     * @throws java.io.IOException
     */
    @Test
    public void testActivate() throws IOException {
        System.out.println("activate");
        ArmLED instance = new ArmLED();
        int expResult = 0;
        int result = instance.activate();
        try {
            result = instance.activate();
        } catch(IOException ex) {
            fail("IOException reported: " + ex.getMessage());
        }
        assertEquals(expResult, result);
    }    
}
