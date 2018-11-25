package edu.ccsu.cs417.dgt.adapter;

import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author curti
 */
public class ArmBuzzerTest {

    /**
     * Test of activate method, of class ArmBuzzer.
     * @throws java.io.IOException
     */
    @Test
    public void testActivate() throws IOException {
        System.out.println("activate");
        ArmBuzzer instance = new ArmBuzzer();
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
