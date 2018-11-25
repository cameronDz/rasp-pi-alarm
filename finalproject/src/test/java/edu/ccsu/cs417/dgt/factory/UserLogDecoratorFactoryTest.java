/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.dgt.factory;

import edu.ccsu.cs417.dgt.factory.UserLogDecoratorFactory;
import edu.ccsu.cs417.dgt.logger.BasicLog;
import edu.ccsu.cs417.dgt.logger.LogInterface;
import edu.ccsu.cs417.dgt.logger.UserLogDecorator;
import edu.ccsu.cs417.dgt.user.BasicUser;
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
     * Test of createLog method, of class UserLogDecoratorFactory.
     */
    @Test
    public void testCreateLog() {
        System.out.println("createLog");
        String user = "ONE";
        String action = "TWO";
        UserLogDecoratorFactory userFactory = new UserLogDecoratorFactory();
        LogInterface expResult = new BasicLog(1,2);
        LogInterface d = new UserLogDecorator(new BasicUser(user), expResult);
        d.setMessage(action);
        LogInterface result = userFactory.createLog(user,action);
        assertEquals(expResult, result);
    }
    
}
