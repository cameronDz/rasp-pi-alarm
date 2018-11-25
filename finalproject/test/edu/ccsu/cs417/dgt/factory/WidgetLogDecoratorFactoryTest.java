/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.dgt.factory;

import edu.ccsu.cs417.dgt.factory.WidgetLogDecoratorFactory;
import edu.ccsu.cs417.dgt.logger.BasicLog;
import edu.ccsu.cs417.dgt.logger.LogInterface;
import edu.ccsu.cs417.dgt.logger.WidgetLogDecorator;
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
public class WidgetLogDecoratorFactoryTest {
    
    public WidgetLogDecoratorFactoryTest() {
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
     * Test of createLog method, of class WidgetLogDecoratorFactory.
     */
    @Test
    public void testCreateLog() {
        System.out.println("createLog");
        String widget = "ONE";
        String action = "TWO";
        WidgetLogDecoratorFactory widgetFactory= new WidgetLogDecoratorFactory();
        LogInterface expResult = new BasicLog(3,4);
        LogInterface d = new WidgetLogDecorator(widget, expResult);
        d.setMessage(action);
        LogInterface result = widgetFactory.createLog(widget, action);
        assertEquals(expResult, result);
    }
    
}
