package edu.ccsu.cs417.dgt.factory;

import edu.ccsu.cs417.dgt.logger.BasicLog;
import edu.ccsu.cs417.dgt.logger.LogInterface;
import edu.ccsu.cs417.dgt.logger.WidgetLogDecorator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cameron
 */
public class WidgetLogDecoratorFactoryTest {

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
