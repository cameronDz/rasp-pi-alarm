/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.group2.finalproject.logger;

import edu.ccsu.cs417.group2.finalproject.logger.LogCollection;
import edu.ccsu.cs417.group2.finalproject.logger.BasicLog;
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
    
}
