/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.dgt.state;

import edu.ccsu.cs417.dgt.state.SecuritySystem;
import edu.ccsu.cs417.dgt.state.DetectorState;
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
public class SecuritySystemTest {
    
    public SecuritySystemTest() {
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
     * Test of setDetectorState method, of class SecuritySystem.
     */
    @Test
    public void testSetDetectorState() {
        System.out.println("setDetectorState");
        DetectorState newDetectorState = null;
        SecuritySystem instance = new SecuritySystem();
        instance.setDetectorState(newDetectorState);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of arm method, of class SecuritySystem.
     */
    @Test
    public void testArm() throws Exception {
        System.out.println("arm");
        UserNotification notifier = null;
        SecuritySystem instance = new SecuritySystem();
        instance.arm(notifier);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of disarm method, of class SecuritySystem.
     */
    @Test
    public void testDisarm() {
        System.out.println("disarm");
        SecuritySystem instance = new SecuritySystem();
        instance.disarm();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIsArmedState method, of class SecuritySystem.
     */
    @Test
    public void testGetIsArmedState() {
        System.out.println("getIsArmedState");
        SecuritySystem instance = new SecuritySystem();
        DetectorState expResult = null;
        DetectorState result = instance.getIsArmedState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIsDisarmedState method, of class SecuritySystem.
     */
    @Test
    public void testGetIsDisarmedState() {
        System.out.println("getIsDisarmedState");
        SecuritySystem instance = new SecuritySystem();
        DetectorState expResult = null;
        DetectorState result = instance.getIsDisarmedState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
