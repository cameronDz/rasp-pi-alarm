/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.dgt.state;

import edu.ccsu.cs417.dgt.state.DisarmedState;
import edu.ccsu.cs417.dgt.strategy.UserNotification;
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
public class DisarmedStateTest {
    
    public DisarmedStateTest() {
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
     * Test of arm method, of class DisarmedState.
     */
    @Test
    public void testArm() throws Exception {
        System.out.println("arm");
        UserNotification notifier = null;
        DisarmedState instance = null;
        instance.arm(notifier);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of disarm method, of class DisarmedState.
     */
    @Test
    public void testDisarm() {
        System.out.println("disarm");
        DisarmedState instance = null;
        instance.disarm();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
