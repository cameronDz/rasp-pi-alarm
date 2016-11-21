/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.group2.finalproject.logger;

import edu.ccsu.cs417.group2.finalproject.user.UserInterface;
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
public class UserLogDecoratorTest {
    
    public UserLogDecoratorTest() {
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
     * Test of setMessage method, of class UserLogDecorator.
     */
    @Test
    public void testSetMessage() {
        System.out.println("setMessage");
        String s = "";
        UserLogDecorator instance = null;
        instance.setMessage(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class UserLogDecorator.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        UserLogDecorator instance = null;
        UserInterface expResult = null;
        UserInterface result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class UserLogDecorator.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        UserLogDecorator instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class UserLogDecorator.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        UserLogDecorator instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
