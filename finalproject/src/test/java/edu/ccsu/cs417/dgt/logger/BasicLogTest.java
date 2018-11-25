/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.dgt.logger;

import edu.ccsu.cs417.dgt.logger.BasicLog;
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
public class BasicLogTest {
    
    public BasicLogTest() {
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
     * Test of toString method, of class Log.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        BasicLog instance = new BasicLog(1, 2);
        String expResult = "1 2 No message.";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMessage method, of class BasicLog.
     */
    @Test
    public void testSetMessage() {
        System.out.println("setMessage");
        String s = "This message here";
        BasicLog instance = new BasicLog(1, 2);
        instance.setMessage(s);
        String expResult = s;
        String result = instance.getMessage();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMessage method, of class BasicLog.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        BasicLog instance = new BasicLog(1, 2, "Message Test." );
        String expResult = "Message Test.";
        String result = instance.getMessage();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTime method, of class BasicLog.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        BasicLog instance = new BasicLog(1, 2, "Message Test." );
        int expResult = 2;
        int result = instance.getTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDate method, of class BasicLog.
     */
    @Test
    public void testGetDateTrue() {
        System.out.println("getDate");
        BasicLog instance = new BasicLog(1, 2, "Message Test." );
        int expResult = 1;
        int result = instance.getDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of hashCode method, of class BasicLog.
     */
    @Test
    public void testHashCodeTrue() {
        System.out.println("hashCode-true");
        BasicLog instance = new BasicLog(1, 2, "M");
        int expResult = 3 + "M".hashCode();
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of hashCode method, of class BasicLog.
     */
    @Test
    public void testHashCodeFalse() {
        System.out.println("hashCode-false");
        BasicLog instance = new BasicLog(1, 2, "M");
        int expResult = 3 + "t".hashCode();
        int result = instance.hashCode();
        assertNotEquals(expResult, result);
    }

    /**
     * Test of equals method, of class BasicLog.
     */
    @Test
    public void testEqualsTrue() {
        System.out.println("equals-true");
        Object obj = new BasicLog(1, 2, "Message Test." );
        BasicLog instance = new BasicLog(1, 2, "Message Test." );
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method, of class BasicLog.
     */
    @Test
    public void testEqualsFalse() {
        System.out.println("equals-false");
        Object obj = new BasicLog(1, 3, "Message Test." );
        BasicLog instance = new BasicLog(1, 2, "Message Test" );
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method, of class BasicLog.
     */
    @Test
    public void testEqualsNull() {
        System.out.println("equals-null_obj");
        Object obj = null;
        BasicLog instance = new BasicLog(1, 2, "Message Test" );
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
}
