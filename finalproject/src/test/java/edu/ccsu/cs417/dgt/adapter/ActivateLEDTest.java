package edu.ccsu.cs417.dgt.adapter;

import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tom
 */
public class ActivateLEDTest {

    /**
     * Test of activate method, of class ActivateLED.
     * @throws IOException
     */
    @Test
    public void testActivateArmLEDException() throws IOException{
        System.out.println("activateArm");
        ActivateLED instance = new ArmLED();
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
     * Test of deactivate method for the exception and expected return code
     * @throws IOException
     */
    @Test
    public void testActivateDisarmLEDException() throws IOException {
        System.out.println("activateDisarm");
        ActivateLED instance = new ArmLED();
        DisarmLED test = new DisarmLED();
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

    public class ActivateLEDImpl implements ActivateLED {
        @Override
        public int activate() throws IOException {
            return 0;
        }
    }
}
