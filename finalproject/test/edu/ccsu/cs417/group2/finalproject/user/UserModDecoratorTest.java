/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.group2.finalproject.user;

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
public class UserModDecoratorTest {
    
    public UserModDecoratorTest() {
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
     * Test of deleteUser method, of class UserModDecorator.
     */
    @Test
    public void testDeleteUser() {
        System.out.println("deleteUser");
        String name = "";
        UserModDecorator instance = new UserModDecorator(new BasicUser("Hillary"));
        instance.deleteUser(name);
        // Delete user never fully implemented
        fail("deleteUser not implemented");
    }

    /**
     * Test of hashCode method, of class UserModDecorator.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        UserModDecorator instance1 = new UserModDecorator(new BasicUser("Kelly"));
        UserModDecorator instance2 = new UserModDecorator(new BasicUser("Kelly"));
        assertTrue(instance1.hashCode() == instance2.hashCode());
    }

      /**
     * Test of getName method, of class UserModDecorator.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        UserModDecorator instance = new UserModDecorator(new BasicUser("Tom"));
        String expResult = "Tom";
        String result = instance.getName();
        assertEquals(expResult, result);
    }
    
     /**
     * Test of setName method, of class UserModDecorator.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Sarah";
        UserModDecorator instance = new UserModDecorator(new BasicUser("Martha"));
        instance.setName(name);
        String result = instance.getName();
        assertEquals(name, result);
    }

    /**
     * Test of getStatus method, of class UserModDecorator.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        UserModDecorator instance = new UserModDecorator(new BasicUser("Karen"));
        String expResult = "Moderator";
        String result = instance.getStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStatus method, of class UserModDecorator.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        UserModDecorator instance = new UserModDecorator(new BasicUser("Jason"));
        String expResult = "Administrator";
        instance.setStatus("Administrator");
        String result = instance.getStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDecoratedUser method, of class UserModDecorator.
     */
    @Test
    public void testGetDecoratedUser() {
        System.out.println("getDecoratedUser");
        BasicUser becky = new BasicUser("Becky");
        UserModDecorator instance = new UserModDecorator(becky);
        UserInterface expResult = becky;
        UserInterface result = instance.getDecoratedUser();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class UserModDecorator.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        UserModDecorator instance = new UserModDecorator(new BasicUser("Jason"));
        String expResult = "Jason Moderator";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Testing Equals method with null object parameter
     */
    @Test
    public void testEqualsNull() {
        System.out.println("equals");
        UserModDecorator user = null;
        UserModDecorator instance = new UserModDecorator(new BasicUser("Angela"));
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
        UserModDecorator instance = new UserModDecorator(new BasicUser("Angela"));
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
        UserModDecorator user = new UserModDecorator(new BasicUser("Angela"));
        UserModDecorator instance = new UserModDecorator(new BasicUser("Angela"));
        boolean expResult = true;
        boolean result = instance.equals(user);
        assertEquals(expResult, result);
    }
    
    /**
     * Testing Equals method with two objects with different names
     */
    @Test
    public void testEqualsFail() {
        System.out.println("equals");
        UserModDecorator user = new UserModDecorator(new BasicUser("Barney"));
        UserModDecorator instance = new UserModDecorator(new BasicUser("Angela"));
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
        UserInterface u = new BasicUser("Barney");
        UserModDecorator instance = new UserModDecorator(u);
        instance.setComposite(c);
        UserComposite expResult = c;
        UserComposite result = instance.getComposite();
        assertEquals(expResult, result);
    }
}
