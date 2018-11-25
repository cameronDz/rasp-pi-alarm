package edu.ccsu.cs417.dgt.factory;

import edu.ccsu.cs417.dgt.logger.BasicLog;
import edu.ccsu.cs417.dgt.logger.LogInterface;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cameron
 */
public class BasicLogFactoryTest {

    /**
     * Test of createLog method, of class BasicLogFactory.
     */
    @Test
    public void testCreateLog() {
        System.out.println("createLog");
        String message = "ONE";
        String empty = "TWO";
        BasicLogFactory userFactory = new BasicLogFactory();
        LogInterface expResult = new BasicLog(1,1,message);
        LogInterface result = userFactory.createLog(message, empty);
        assertEquals(expResult, result);
    }    
}
