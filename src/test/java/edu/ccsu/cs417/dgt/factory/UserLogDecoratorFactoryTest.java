package edu.ccsu.cs417.dgt.factory;

import edu.ccsu.cs417.dgt.logger.BasicLog;
import edu.ccsu.cs417.dgt.logger.LogInterface;
import edu.ccsu.cs417.dgt.logger.UserLogDecorator;
import edu.ccsu.cs417.dgt.user.BasicUser;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cameron
 */
public class UserLogDecoratorFactoryTest {

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
