/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.dgt.adapter;

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
public class ArmTest {
    
    public ArmTest() {
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
     * Test of activate method, of class Arm.
     * @throws Exception
     */
    @Test
    public void testActivate() throws Exception {
        System.out.println("activate");
        UserNotification notifier = new UserNotification(new SilentStrategy());
        Arm instance = new Arm();
        String expResult = "";
        String result = instance.activate(notifier);
        try {
            result = instance.activate(notifier);
        } catch(IOException ex) {
            fail("IOException reported: " + ex.getMessage());
        }
        assertEquals(expResult, result);
    }
    
}
