/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.group2.finalproject.state;

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
public class DetectorStateTest {
    
    public DetectorStateTest() {
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
     * Test of arm method, of class DetectorState.
     */
    @Test
    public void testArm() throws Exception {
        System.out.println("arm");
        DetectorState instance = new DetectorStateImpl();
        instance.arm();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of disarm method, of class DetectorState.
     */
    @Test
    public void testDisarm() {
        System.out.println("disarm");
        DetectorState instance = new DetectorStateImpl();
        instance.disarm();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class DetectorStateImpl implements DetectorState {

        public void arm() throws IOException {
        }

        public void disarm() {
        }
    }
    
}
