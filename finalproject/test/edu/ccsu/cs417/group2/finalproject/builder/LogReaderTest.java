/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.group2.finalproject.builder;

import edu.ccsu.cs417.group2.finalproject.logger.BasicLog;
import edu.ccsu.cs417.group2.finalproject.logger.LogInterface;
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
public class LogReaderTest {
    
    public LogReaderTest() {
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
     * Test of parseLog method, of class LogReader.
     */
    @Test
    public void testParseLog() {
        System.out.println("parseLog");
        LogInterface log = new BasicLog(123, 234, "Message.");
        LogBuilder builder = new JsonLogBuilder();
        LogReader instance = new LogReader(builder);
        instance.parseLog(log);
        
        String expResult = "LogReader:\n" + "JsonLogBuilder:\n" +
                "{\"date\": 123, \"time\": 234, \"messsage\": \"Message.\"";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBuilder method, of class LogReader.
     */
    @Test
    public void testGetBuilder() {
        System.out.println("getBuilder");
        LogBuilder builder = new JsonLogBuilder();
        LogReader instance = new LogReader(builder);
        LogBuilder expResult = builder;
        LogBuilder result = instance.getBuilder();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class LogReader.
     */
    @Test
    public void testToString() {
        System.out.println("toString-empty");
        LogBuilder builder = new JsonLogBuilder();
        LogReader instance = new LogReader(builder);
        String expResult = "LogReader:\n" + "JsonLogBuilder:\n" + null;
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of hashCode method, of class LogReader.
     */
    @Test
    public void testHashCodeNull() {
        System.out.println("hashCode-null");
        LogBuilder builder = null;
        LogReader instance = new LogReader(builder);
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of hashCode method, of class LogReader.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        LogInterface log = new BasicLog(123, 234, "Message");
        LogBuilder builder = new JsonLogBuilder();
        LogReader instance = new LogReader(builder);
        instance.parseLog(log);
        int expResult = builder.hashCode();
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class LogReader.
     */
    @Test
    public void testEqualsNullFalse() {
        System.out.println("equals-null-false");
        Object obj = new Object();
        LogBuilder builder = new JsonLogBuilder();
        LogReader instance = new LogReader(builder);
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
}
