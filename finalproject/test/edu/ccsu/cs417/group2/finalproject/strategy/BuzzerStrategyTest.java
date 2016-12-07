
package edu.ccsu.cs417.group2.finalproject.strategy;

import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author curti
 */
public class BuzzerStrategyTest {
    
    public BuzzerStrategyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of execute method, of class BuzzerStrategy.
     */
    @Test
    public void testExecute() throws InterruptedException, IOException {
        System.out.println("execute");
        BuzzerStrategy instance = new BuzzerStrategy();
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
