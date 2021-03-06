package edu.ccsu.cs417.dgt.logger;

import edu.ccsu.cs417.dgt.user.BasicUser;
import edu.ccsu.cs417.dgt.user.UserInterface;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cameron
 */
public class UserLogDecoratorTest {

    @Test
    public void testSetMessage() {
        String s = "message";
        BasicUser user = new BasicUser("Sammy");
        BasicLog log = new BasicLog(1,2);
        UserLogDecorator instance = new UserLogDecorator(user, log);
        instance.setMessage(s);
        String expected = "USER: BasicUser [name=Sammy, parent=null] PERFORMED: message";
        String actual = instance.getMessage();
        assertEquals(expected, actual);
    }

    /**
     * Test of getUser method, of class UserLogDecorator.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        BasicUser user = new BasicUser("Sammy");
        BasicLog log = new BasicLog(1,2);
        UserLogDecorator instance = new UserLogDecorator(user, log);
        UserInterface expResult = user;
        UserInterface result = instance.getUser();
        assertEquals(expResult, result);
    }

    /**
     * Test of hashCode method, of class UserLogDecorator.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        BasicUser user = new BasicUser("Sammy");
        BasicLog log = new BasicLog(1,2);
        UserLogDecorator instance = new UserLogDecorator(user, log);
        int expResult = log.hashCode() + user.hashCode();
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class UserLogDecorator.
     */
    @Test
    public void testEqualsFalse() {
        System.out.println("equals-false");
        BasicUser user = new BasicUser("Sammy");
        BasicLog log = new BasicLog(1,2);
        UserLogDecorator instance = new UserLogDecorator(user, log);
        Object obj = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method, of class UserLogDecorator.
     */
    @Test
    public void testEqualsTrue() {
        System.out.println("equals-true");
        BasicUser user = new BasicUser("Sammy");
        BasicLog log = new BasicLog(1,2);
        UserLogDecorator instance = new UserLogDecorator(user, log);
        Object obj = new UserLogDecorator(user, log);
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
}
