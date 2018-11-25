package edu.ccsu.cs417.dgt.logger;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cameron
 */
public class WidgetLogDecoratorTest {

    /**
     * Test of setMessage method, of class WidgetLogDecorator.
     */
    @Test
    public void testSetMessage() {
        System.out.println("setMessage");
        String s = "ducks";
        String w = "Widget-A";
        BasicLog log = new BasicLog(1,2);
        WidgetLogDecorator instance = new WidgetLogDecorator(w, log); 
        instance.setMessage(s);
        String expResult = "WIDGET: " + w + " ACTION: " + s;
        String result = instance.getMessage();
        assertEquals(expResult, result);
    }

    /**
     * Test of getWidget method, of class WidgetLogDecorator.
     */
    @Test
    public void testGetWidget() {
        System.out.println("getWidget");
        WidgetLogDecorator instance = new WidgetLogDecorator("Widget-A", new BasicLog(1,2)); 
        String expResult = "Widget-A";
        String result = instance.getWidget();
        assertEquals(expResult, result);
    }

    /**
     * Test of hashCode method, of class WidgetLogDecorator.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        BasicLog log = new BasicLog(1,2);
        String wid = "Widget-A";
        WidgetLogDecorator instance = new WidgetLogDecorator(wid, log); 
        int expResult = log.hashCode() + wid.hashCode();
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class WidgetLogDecorator.
     */
    @Test
    public void testEqualsTrue() {
        System.out.println("equals");
        BasicLog log = new BasicLog(1,2);
        String wid = "Widget-A";
        WidgetLogDecorator instance = new WidgetLogDecorator(wid, log); 
        Object obj = instance;
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method, of class WidgetLogDecorator.
     */
    @Test
    public void testEqualsFalse() {
        System.out.println("equals");
        BasicLog log = new BasicLog(1,2);
        String wid = "Widget-A";
        WidgetLogDecorator instance = new WidgetLogDecorator(wid, log); 
        Object obj = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }    
}
