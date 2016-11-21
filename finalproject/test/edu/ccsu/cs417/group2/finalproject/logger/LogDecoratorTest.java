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
public class LogDecoratorTest {
    
    public LogDecoratorTest() {
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
     * Test of setMessage method, of class LogDecorator.
     */
    @Test
    public void testSetMessage() {
        System.out.println("setMessage");
        String s = "Test Message.";
        BasicLog log = new BasicLog(1, 2);
        LogDecorator instance = new WidgetLogDecorator("Widget", log);
        instance.setMessage(s);
        String expResult = "WIDGET: Widget ACTION: Test Message.";
        String result = instance.getMessage();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAction method, of class LogDecorator.
     */
    @Test
    public void testSetAction() {
        System.out.println("setAction");
        String s = "";
        LogDecorator instance = null;
        instance.setAction(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAction method, of class LogDecorator.
     */
    @Test
    public void testGetAction() {
        System.out.println("getAction");
        LogDecorator instance = null;
        String expResult = "";
        String result = instance.getAction();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessage method, of class LogDecorator.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        LogDecorator instance = null;
        String expResult = "";
        String result = instance.getMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTime method, of class LogDecorator.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        LogDecorator instance = null;
        int expResult = 0;
        int result = instance.getTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class LogDecorator.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        LogDecorator instance = null;
        int expResult = 0;
        int result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDecoratedLog method, of class LogDecorator.
     */
    @Test
    public void testGetDecoratedLog() {
        System.out.println("getDecoratedLog");
        LogDecorator instance = null;
        LogInterface expResult = null;
        LogInterface result = instance.getDecoratedLog();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class LogDecorator.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        LogDecorator instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class LogDecorator.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        LogDecorator instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class LogDecorator.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        LogDecorator instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class LogDecoratorImpl extends LogDecorator {

        public LogDecoratorImpl() {
            super(null);
        }

        public void setMessage(String s) {
        }
    }
    
}
