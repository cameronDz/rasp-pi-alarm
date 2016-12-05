/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.group2.finalproject.logger;

import edu.ccsu.cs417.group2.finalproject.factory.BasicLogFactory;
import edu.ccsu.cs417.group2.finalproject.factory.WidgetLogDecoratorFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import edu.ccsu.cs417.group2.finalproject.factory.AbstractLogFactory;

/**
 *
 * @author ngreeshdfg
 */
public class LogDecoratorFactoryTest {
    
    public LogDecoratorFactoryTest() {
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
     * Test of getLogDecorator method, of class LogDecoratorFactory.
     */
    @Test
    public void testGetLogDecorator() {
        System.out.println("getLogDecorator");
        BasicLog c = new BasicLog(2112016,164902);
        AbstractLogFactory factory = new WidgetLogDecoratorFactory("A", c);
        LogDecorator expResult = new WidgetLogDecorator("A", c);
        LogDecorator result = BasicLogFactory.getLogDecorator(factory);
        assertEquals(expResult, result);
    }
    
}
