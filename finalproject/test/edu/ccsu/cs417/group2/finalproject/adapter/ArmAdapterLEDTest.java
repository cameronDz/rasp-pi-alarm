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
public class ArmAdapterLEDTest {
    
    public ArmAdapterLEDTest() {
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
     * Test of activate method, of class ArmAdapterLED.
     * @throws IOException
     */
    @Test
    public void testActivate() throws IOException {
        System.out.println("activate");
        ArmAdapterLED instance = new ArmAdapterLED();
        int expResult = 2;
        int result = instance.activate();
        try {
            result = instance.activate();
        } catch(IOException ex) {
            fail("IOException reported: " + ex.getMessage());
        }
        assertEquals(expResult, result);
    }
    

    
}
