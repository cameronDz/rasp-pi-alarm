/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.group2.finalproject.logger;

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
public class LogDecoratorAbstractFactoryTest {
    
    public LogDecoratorAbstractFactoryTest() {
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
     * Test of createLogDecorator method, of class LogDecoratorAbstractFactory.
     */
    @Test
    public void testCreateLogDecorator() {
        System.out.println("createLogDecorator");
        AbstractLogFactory instance = new LogDecoratorAbstractFactoryImpl();
        BasicLog c = new BasicLog(2112016,164902);
        LogDecorator expResult = new WidgetLogDecorator("A", c);
        LogDecorator result = instance.createLogDecorator();
        assertEquals(expResult, result);
    }

    public class LogDecoratorAbstractFactoryImpl implements AbstractLogFactory {

        public LogDecorator createLogDecorator() {
            BasicLog c = new BasicLog(2112016,164902);
            return new WidgetLogDecorator("A", c);
        }
    }
    
}
