/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.group2.finalproject.logger;

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
public class WidgetLogDecoratorTest {
    
    public WidgetLogDecoratorTest() {
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
     * Test of setMessage method, of class WidgetLogDecorator.
     */
    @Test
    public void testSetMessage() {
        System.out.println("setMessage");
        String s = "";
        WidgetLogDecorator instance = null;
        instance.setMessage(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWidget method, of class WidgetLogDecorator.
     */
    @Test
    public void testGetWidget() {
        System.out.println("getWidget");
        WidgetLogDecorator instance = null;
        String expResult = "";
        String result = instance.getWidget();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class WidgetLogDecorator.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        WidgetLogDecorator instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class WidgetLogDecorator.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        WidgetLogDecorator instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
