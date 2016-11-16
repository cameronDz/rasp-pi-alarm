/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.group2.finalproject.logger;

import edu.ccsu.cs417.group2.finalproject.logger.BasicLog;
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
    
}
