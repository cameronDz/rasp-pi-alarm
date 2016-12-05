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
public class WidgetLogDecoratorFactoryTest {
    
    public WidgetLogDecoratorFactoryTest() {
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
     * Test of createLog method, of class WidgetLogDecoratorFactory.
     */
    @Test
    public void testCreateLog() {
        System.out.println("createLog");
        String widget = "";
        String action = "";
        WidgetLogDecoratorFactory instance = new WidgetLogDecoratorFactory();
        LogInterface expResult = null;
        LogInterface result = instance.createLog(widget, action);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
