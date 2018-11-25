package edu.ccsu.cs417.dgt.adapter;

import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author curti
 */
public class DisarmBuzzerTest {

    /**
     * Test of deactivate method, of class DisarmBuzzer.
     * @throws java.io.IOException
     */
    @Test
    public void testDeactivate() throws IOException {
        System.out.println("deactivate");
        DisarmBuzzer instance = new DisarmBuzzer();
        int expResult = 0;
        int result = instance.deactivate();
        try {
            result = instance.deactivate();
        } catch(IOException ex) {
            fail("IOException reported: " + ex.getMessage());
        }
        assertEquals(expResult, result);
    }
    
}
