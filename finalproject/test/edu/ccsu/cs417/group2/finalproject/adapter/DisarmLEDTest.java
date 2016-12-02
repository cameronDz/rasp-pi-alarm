/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.group2.finalproject.adapter;

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
public class DisarmLEDTest {
    
    public DisarmLEDTest() {
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
     * Test of deactivate method, of class DisarmLED.
     * @throws Exception
     */
    @Test
    public void testDeactivate() throws Exception {
        System.out.println("deactivate");
        DisarmLED instance = new DisarmLED();
        int expResult = 2;
        int result = instance.deactivate();
        try {
            result = instance.deactivate();
        } catch(IOException ex) {
            fail("IOException reported: " + ex.getMessage());
        }
        assertEquals(expResult, result);
    }
    
}
