/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.group2.finalproject.factory;

import edu.ccsu.cs417.group2.finalproject.logger.LogInterface;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cameron
 */
public class BasicLogFactoryTest {
    
    public BasicLogFactoryTest() {
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
     * Test of createLog method, of class BasicLogFactory.
     */
    @Test
    public void testCreateLog() {
        System.out.println("createLog");
        String message = "";
        String empty = "";
        BasicLogFactory instance = new BasicLogFactory();
        LogInterface expResult = null;
        LogInterface result = instance.createLog(message, empty);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
