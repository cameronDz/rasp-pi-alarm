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
public class LogInterfaceTest {
    
    public LogInterfaceTest() {
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
     * Test of setMessage method, of class LogInterface.
     */
    @Test
    public void testSetMessage() {
        System.out.println("setMessage");
        String s = "";
        LogInterface instance = new LogInterfaceImpl();
        instance.setMessage(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessage method, of class LogInterface.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        LogInterface instance = new LogInterfaceImpl();
        String expResult = "";
        String result = instance.getMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTime method, of class LogInterface.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        LogInterface instance = new LogInterfaceImpl();
        int expResult = 0;
        int result = instance.getTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class LogInterface.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        LogInterface instance = new LogInterfaceImpl();
        int expResult = 0;
        int result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class LogInterface.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        LogInterface instance = new LogInterfaceImpl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class LogInterface.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        LogInterface instance = new LogInterfaceImpl();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class LogInterface.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        LogInterface instance = new LogInterfaceImpl();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class LogInterfaceImpl implements LogInterface {

        public void setMessage(String s) {
        }

        public String getMessage() {
            return "";
        }

        public int getTime() {
            return 0;
        }

        public int getDate() {
            return 0;
        }

        public String toString() {
            return "";
        }

        public int hashCode() {
            return 0;
        }

        public boolean equals(Object obj) {
            return false;
        }
    }
    
}
