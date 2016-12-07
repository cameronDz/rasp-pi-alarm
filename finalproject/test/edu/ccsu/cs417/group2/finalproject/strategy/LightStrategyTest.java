/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class LightStrategyTest {
    
    public LightStrategyTest() {
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
     * Test of execute method, of class LightStrategy.
     */
    @Test
    public void testExecute() throws Exception {
        System.out.println("execute");
        LightStrategy instance = new LightStrategy();
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
