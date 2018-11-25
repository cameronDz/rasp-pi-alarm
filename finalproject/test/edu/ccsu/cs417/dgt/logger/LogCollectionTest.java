/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.dgt.logger;

import edu.ccsu.cs417.dgt.logger.BasicLog;
import edu.ccsu.cs417.dgt.logger.LogCollection;
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
    public void testSizeZero() {
        System.out.println("size-zero");
        LogCollection instance = new LogCollection();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of size method, of class LogCollection.
     */
    @Test
    public void testSizeThree() {
        System.out.println("size-three");
        BasicLog t = new BasicLog(1, 2, "first");
        BasicLog t2 = new BasicLog(2, 3, "second");
        BasicLog t3 = new BasicLog(3, 4, "third");
        LogCollection instance = new LogCollection();
        instance.addLog(t);
        instance.addLog(t2);
        instance.addLog(t3);
        int expResult = 3;
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
    public void testToStringTwo() {
        System.out.println("toString-two");
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
     * Test of toString method, of class LogCollection.
     */
    @Test
    public void testToStringEmpty() {
        System.out.println("toString-empty");
        LogCollection instance = new LogCollection();
        String expResult = "";
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
    public void testEqualsTrue() {
        System.out.println("equals-true");
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

    /**
     * Test of equals method, of class LogCollection.
     */
    @Test
    public void testEqualsFalse() {
        System.out.println("equals-false");
        LogCollection objCol = new LogCollection();
        LogCollection instance = new LogCollection();
        BasicLog t = new BasicLog(1, 2, "first");
        BasicLog t2 = new BasicLog(2, 3, "second");
        instance.add(t);
        instance.add(t2);
        objCol.add(t);
        Object obj = objCol;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method, of class LogCollection.
     */
    @Test
    public void testEqualsEmpty() {
        System.out.println("equals-empty");
        LogCollection objCol = new LogCollection();
        LogCollection instance = new LogCollection();
        boolean expResult = true;
        boolean result = instance.equals(objCol);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method, of class LogCollection.
     */
    @Test
    public void testEqualsNull() {
        System.out.println("equals-null");
        LogCollection instance = new LogCollection();
        boolean expResult = false;
        boolean result = instance.equals(null);
        assertEquals(expResult, result);
    }
}
