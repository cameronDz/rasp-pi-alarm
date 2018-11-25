/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.dgt.adapter;

import edu.ccsu.cs417.dgt.adapter.Disarm;
import java.io.IOException;
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
public class DisarmTest {
    
    public DisarmTest() {
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
     * Test of deactivate method, of class Disarm.
     * @throws Exception
     */
    @Test
    public void testDeactivate() throws IOException {
        System.out.println("deactivate");
        Disarm instance = new Disarm();
        String expResult = "";
        String result = instance.deactivate();
        assertEquals(expResult, result);
    }
    
}
