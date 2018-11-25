package edu.ccsu.cs417.dgt.adapter;

import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tom
 */
public class ArmAdapterLEDTest {

    /**
     * Test of activate method, of class ArmAdapterLED.
     * @throws IOException
     */
    @Test
    public void testActivate() throws IOException {
        System.out.println("activate");
        ArmAdapterLED instance = new ArmAdapterLED();
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
