/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.group2.finalproject.user;

import java.util.Iterator;
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
public class UserListCompositeTest {
    
    UserListComposite comp;
    
    public UserListCompositeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        comp = new UserListComposite("List");
    }
    
    @After
    public void tearDown() {
        comp = null;
    }

     /**
     * Test of getName method, of class UserListComposite.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "List";
        String result = comp.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class UserListComposite.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "newName";
        comp.setName(name);
        String result = comp.getName();
        assertEquals(name, result);
    }

    /**
     * Testing adding a user to an empty list for UserListComposite
     */
    @Test
    public void testAddUserEmptyList() {
        System.out.println("addUser");
        UserInterface user = new BasicUser("Ashley");
        comp.addUser(user);
        String expResult = "List: \n"
                + "Ashley\n";
        String result = comp.toString();
        assertEquals(expResult, result);
    }
    
    /**
     * Testing adding a user to a non-empty list for UserListComposite
     */
    @Test
    public void testAddUserNonEmptyList() {
        System.out.println("addUser");
        UserInterface user1 = new BasicUser("Ashley");
        UserInterface user2 = new UserModDecorator(new BasicUser("Mitch"));
        comp.addUser(user1);
        comp.addUser(user2);
        String expResult = "List: \n"
                + "Ashley\n"
                + "Mitch Moderator\n";
        String result = comp.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of removeUser method failing
     */
    @Test
    public void testRemoveUserFail() {
        System.out.println("removeUser");
        UserInterface user = new BasicUser("Carol");
        UserInterface result = comp.removeUser(user);
        UserInterface expResult = null;
        assertEquals(expResult, result);
    }
    
    /**
     * Test of removeUser method passing
     */
    @Test
    public void testRemoveUserPass() {
        System.out.println("removeUser");
        comp.addUser(new BasicUser("Carol"));
        UserInterface user = new BasicUser("Carol");
        UserInterface result = comp.removeUser(user);
        UserInterface expResult = user;
        assertEquals(expResult, result);
    }

    /**
     * Test of iterator method for empty list of UserListComposite
     */
    @Test
    public void testIteratorEmptyList() {
        System.out.println("iterator");
        Iterator<UserInterface> result = comp.iterator();
        assertTrue(result.hasNext() == false);
    }
    
     /**
     * Test of iterator method for non-empty list of UserListComposite
     */
    @Test
    public void testIteratorNonEmptyList() {
        System.out.println("iterator");
        UserModDecorator sally = new UserModDecorator(new BasicUser("Sally"));
        BasicUser martin = new BasicUser("Martin");
        UserAdminDecorator george = new UserAdminDecorator(new BasicUser("George"));
        comp.addUser(sally);
        comp.addUser(martin);
        comp.addUser(george);
        Iterator<UserInterface> result = comp.iterator();
        assertTrue(result.next().equals(sally) && result.next().equals(martin) && result.next().equals(george));
    }

    /**
     * Test of toString method empty list
     */
    @Test
    public void testToStringEmptyList() {
        System.out.println("toString");
        String expResult = "List: \n";
        String result = comp.toString();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of toString method non-empty list
     */
    @Test
    public void testToStringNonEmptyList() {
        System.out.println("toString");
        UserModDecorator sally = new UserModDecorator(new BasicUser("Sally"));
        BasicUser martin = new BasicUser("Martin");
        UserAdminDecorator george = new UserAdminDecorator(new BasicUser("George"));
        comp.addUser(sally);
        comp.addUser(martin);
        comp.addUser(george);
        String expResult = "List: \n"
                + "Sally Moderator\n"
                + "Martin\n"
                + "George Administrator\n";
        String result = comp.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of hashCode method, of class UserComposite.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        UserListComposite comp2 = new UserListComposite("List");
        assertTrue(comp.hashCode() == comp2.hashCode());
    }

    /**
     * Test of equals method with null object
     */
    @Test
    public void testEqualsNull() {
        System.out.println("equals");
        UserListComposite obj = null;
        boolean expResult = false;
        boolean result = comp.equals(obj);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method with same object as parameter
     */
    @Test
    public void testEqualsThis() {
        System.out.println("equals");
        boolean expResult = true;
        boolean result = comp.equals(comp);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method passing
     */
    @Test
    public void testEqualsPass() {
        System.out.println("equals");
        boolean expResult = true;
        UserListComposite comp2 = new UserListComposite("List");
        UserModDecorator sally = new UserModDecorator(new BasicUser("Sally"));
        BasicUser martin = new BasicUser("Martin");
        UserAdminDecorator george = new UserAdminDecorator(new BasicUser("George"));
        comp.addUser(sally);
        comp.addUser(martin);
        comp.addUser(george);
        comp2.addUser(sally);
        comp2.addUser(martin);
        comp2.addUser(george);
        boolean result = comp.equals(comp2);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method failing
     */
    @Test
    public void testEqualsFail() {
        System.out.println("equals");
        boolean expResult = true;
        UserListComposite comp2 = new UserListComposite("List");
        UserModDecorator sally = new UserModDecorator(new BasicUser("Sally"));
        BasicUser martin = new BasicUser("Martin");
        UserAdminDecorator george = new UserAdminDecorator(new BasicUser("George"));
        comp.addUser(sally);
        comp.addUser(martin);
        comp.addUser(george);
        comp2.addUser(sally);
        comp2.addUser(martin);
        boolean result = comp.equals(comp2);
        assertEquals(expResult, result);
    }
    
    /**
     * Testing getComposite method with two objects with different names
     */
    @Test
    public void testGetCompositeSelf() {
        System.out.println("getComposite-self");
        UserListComposite instance = new UserListComposite("List");
        UserComposite expResult = instance;
        UserComposite result = instance.getComposite();
        assertEquals(expResult, result);
    }
    
    /**
     * Testing getComposite method with two objects with different names
     */
    @Test
    public void testGetSetCompositeParent() {
        System.out.println("getComposite_setComposite-parent");
        UserListComposite instance = new UserListComposite("List");
        UserComposite c = new UserListComposite("c");
        instance.setComposite(c);
        UserComposite expResult = c;
        UserComposite result = instance.getComposite();
        assertEquals(expResult, result);
    }
}
