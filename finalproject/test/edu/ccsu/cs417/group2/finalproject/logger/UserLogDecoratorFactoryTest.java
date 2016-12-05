/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.group2.finalproject.logger;

import edu.ccsu.cs417.group2.finalproject.factory.UserLogDecoratorFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import edu.ccsu.cs417.group2.finalproject.user.UserInterface;
import edu.ccsu.cs417.group2.finalproject.user.BasicUser;

/**
 *
 * @author ngreeshdfg
 */
public class UserLogDecoratorFactoryTest {
    
    public UserLogDecoratorFactoryTest() {
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
     * Test of createLogDecorator method, of class UserLogDecoratorFactory.
     */
    @Test
    public void testCreateLogDecorator() {
        System.out.println("createLogDecorator");
        BasicLog c = new BasicLog(2112016,164902);
        UserInterface u = new BasicUser("x");
        UserLogDecoratorFactory instance = new UserLogDecoratorFactory(u, c);
        UserLogDecorator expResult = new UserLogDecorator(u, c);
        LogDecorator result = instance.createLogDecorator();
        assertEquals(expResult, result);
    }
    
}
