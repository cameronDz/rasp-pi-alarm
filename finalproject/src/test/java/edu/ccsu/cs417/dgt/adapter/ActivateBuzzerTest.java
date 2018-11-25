/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.dgt.adapter;

import edu.ccsu.cs417.dgt.adapter.DisarmBuzzer;
import edu.ccsu.cs417.dgt.adapter.ArmBuzzer;
import edu.ccsu.cs417.dgt.adapter.ActivateBuzzer;
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
public class ActivateBuzzerTest {
    
    public ActivateBuzzerTest() {
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
