package edu.ccsu.cs417.dgt.adapter;

import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author curti
 */
public class ArmAdapterBuzzerTest {

    /**
     * Test of activate method, of class ArmAdapterBuzzer.
     * @throws java.io.IOException
     */
    @Test
    public void testActivate() throws IOException {
        System.out.println("activate");
        ArmAdapterBuzzer instance = new ArmAdapterBuzzer();
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
