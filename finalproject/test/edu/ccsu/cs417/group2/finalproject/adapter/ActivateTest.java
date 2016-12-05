/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.group2.finalproject.adapter;

import edu.ccsu.cs417.group2.finalproject.strategy.UserNotification;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ngreeshdfg
 */
public class ActivateTest {
    
    public ActivateTest() {
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
     * Test of activate method for the exception and expected return code
     * @throws IOException
     */
    @Test
    public void testActivateArmException() throws IOException {
        System.out.println("activateArm");
        Activate instance = new Arm();
        String expResult = "";
        String result = instance.activate();
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
    public void testActivateDisarmException() throws IOException {
        System.out.println("activateDisarm");
        Activate instance = new Arm();
        String expResult = "";
        String result = instance.activate();
        try {
            result = instance.activate();
        } catch(IOException ex) {
            fail("IOException reported: " + ex.getMessage());
        }
        assertEquals(expResult, result);
    }

    
    public class ActivateImpl implements Activate {

        @Override
        public String activate(UserNotification notifier) throws IOException {
            return "";
        }
    }
   
}
