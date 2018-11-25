/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.dgt.adapter;

import edu.ccsu.cs417.dgt.adapter.Activate;
import edu.ccsu.cs417.dgt.adapter.Arm;
import edu.ccsu.cs417.dgt.strategy.SilentStrategy;
import edu.ccsu.cs417.dgt.strategy.UserNotification;
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
    public void testActivateArmException() throws IOException, InterruptedException {
        System.out.println("activateArm");
        UserNotification notifier = new UserNotification(new SilentStrategy());
        Activate instance = new Arm();
        String expResult = "";
        String result = instance.activate(notifier);
        try {
            result = instance.activate(notifier);
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
    public void testActivateDisarmException() throws IOException, InterruptedException {
        System.out.println("activateDisarm");
        UserNotification notifier = new UserNotification(new SilentStrategy());
        Activate instance = new Arm();
        String expResult = "";
        String result = instance.activate(notifier);
        try {
            result = instance.activate(notifier);
        } catch(IOException ex) {
            fail("IOException reported: " + ex.getMessage());
        }
        assertEquals(expResult, result);
    }

    /**
     * Test of activate method, of class Activate.
     */
    @Test
    public void testActivate() throws Exception {
        System.out.println("activate");
        UserNotification notifier = null;
        Activate instance = new ActivateImpl();
        String expResult = "";
        String result = instance.activate(notifier);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ActivateImpl implements Activate {

        @Override
        public String activate(UserNotification notifier) throws InterruptedException, IOException {
            return "";
        }
    }
   
}
