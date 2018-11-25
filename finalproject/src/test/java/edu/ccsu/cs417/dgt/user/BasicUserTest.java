/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.dgt.user;

import edu.ccsu.cs417.dgt.user.UserListComposite;
import edu.ccsu.cs417.dgt.user.BasicUser;
import edu.ccsu.cs417.dgt.user.UserComposite;
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
public class BasicUserTest {
    
    public BasicUserTest() {
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
     * Test of getName method, of class BasicUser.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        BasicUser instance = new BasicUser("Kyle");
        String expResult = "Kyle";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class BasicUser.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Suzy";
        BasicUser instance = new BasicUser("Kyle");
        instance.setName(name);
        String result = instance.getName();
        assertEquals(name, result);
    }

    /**
     * Test of toString method, of class BasicUser.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        BasicUser instance = new BasicUser("Elmer");
        String expResult = "Elmer";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of hashCode method, of class BasicUser.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        BasicUser instance1 = new BasicUser("Kelly");
        BasicUser instance2 = new BasicUser("Kelly");
        assertTrue(instance1.hashCode() == instance2.hashCode());
    }

    /**
     * Testing Equals method with null object parameter
     */
    @Test
    public void testEqualsNull() {
        System.out.println("equals");
        BasicUser user = null;
        BasicUser instance = new BasicUser("Angela");
        boolean expResult = false;
        boolean result = instance.equals(user);
        assertEquals(expResult, result);
    }
    
    /**
     * Testing Equals method with same object as parameter
     */
    @Test
    public void testEqualsThis() {
        System.out.println("equals");
        BasicUser instance = new BasicUser("Angela");
        boolean expResult = true;
        boolean result = instance.equals(instance);
        assertEquals(expResult, result);
    }
    
    /**
     * Testing Equals method with two objects with same name
     */
    @Test
    public void testEqualsPass() {
        System.out.println("equals");
        BasicUser user = new BasicUser("Martin");
        BasicUser instance = new BasicUser("Martin");
        boolean expResult = true;
        boolean result = user.equals(instance);
        assertEquals(expResult, result);
    }
    
    /**
     * Testing Equals method with two objects with different names
     */
    @Test
    public void testEqualsFail() {
        System.out.println("equals");
        BasicUser user = new BasicUser("Barney");
        BasicUser instance = new BasicUser("Angela");
        boolean expResult = false;
        boolean result = instance.equals(user);
        assertEquals(expResult, result);
    }
    
    /**
     * Testing getComposite method with two objects with different names
     */
    @Test
    public void testGetSetComposite() {
        System.out.println("getComposite_setComposite");
        UserComposite c = new UserListComposite("c");
        BasicUser instance = new BasicUser("Barney");
        instance.setComposite(c);
        UserComposite expResult = c;
        UserComposite result = instance.getComposite();
        assertEquals(expResult, result);
    }
}
