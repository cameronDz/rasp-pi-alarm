/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.group2.finalproject.logger;

import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.instanceOf;
/**
 *
 * @author ngreeshdfg
 */
public class LogCollectionTest {
    
    public LogCollectionTest() {
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
     * Test of addLog method, of class LogCollection.
     */
    @Test
    public void testAddLog() {
        System.out.println("addLog");
        BasicLog t = new BasicLog(1, 2, "first");
        BasicLog t2 = new BasicLog(2, 3, "second");
        LogCollection instance = new LogCollection();
        instance.addLog(t);
        instance.addLog(t2);
        assertEquals(instance.size(), 2);
    }

    /**
     * Test of size method, of class LogCollection.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        LogCollection instance = new LogCollection();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of iterator method, of class LogCollection.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        LogCollection instance = new LogCollection();
        Iterator result = instance.iterator();
        assertThat(result, instanceOf(Iterator.class));
    }

    /**
     * Test of add method, of class LogCollection.
     */
    @Test
    public void testAdd() {
        BasicLog t = new BasicLog(1, 2, "first");
        BasicLog t2 = new BasicLog(2, 3, "second");
        LogCollection instance = new LogCollection();
        instance.add(t);
        instance.add(t2);
        assertEquals(instance.size(), 2);
    }

    /**
     * Test of toString method, of class LogCollection.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        LogCollection instance = new LogCollection();
        BasicLog t = new BasicLog(1, 2, "first");
        BasicLog t2 = new BasicLog(2, 3, "second");
        instance.add(t);
        instance.add(t2);
        String expResult = "1 2 first" + "\n" + "2 3 second" + "\n";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of hashCode method, of class LogCollection.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        LogCollection instance = new LogCollection();
        BasicLog t = new BasicLog(1, 2, "first");
        BasicLog t2 = new BasicLog(2, 3, "second");
        instance.add(t);
        instance.add(t2);
        int expResult = t.hashCode() + t2.hashCode() + instance.size();
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class LogCollection.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        LogCollection objCol = new LogCollection();
        LogCollection instance = new LogCollection();
        BasicLog t = new BasicLog(1, 2, "first");
        BasicLog t2 = new BasicLog(2, 3, "second");
        instance.add(t);
        instance.add(t2);
        objCol.add(t);
        objCol.add(t2);
        Object obj = objCol;
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
}
