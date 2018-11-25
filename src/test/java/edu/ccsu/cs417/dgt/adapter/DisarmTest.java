package edu.ccsu.cs417.dgt.adapter;

import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ngreeshdfg
 */
public class DisarmTest {
    
    /**
     * Test of deactivate method, of class Disarm.
     * @throws IOException
     */
    @Test
    public void testDeactivate() throws IOException {
        System.out.println("deactivate");
        Disarm instance = new Disarm();
        String expResult = "";
        String result = instance.deactivate();
        assertEquals(expResult, result);
    }
    
}
