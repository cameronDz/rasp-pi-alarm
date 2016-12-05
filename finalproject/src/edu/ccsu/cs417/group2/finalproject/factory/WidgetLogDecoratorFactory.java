package edu.ccsu.cs417.group2.finalproject.factory;

import edu.ccsu.cs417.group2.finalproject.logger.BasicLog;
import edu.ccsu.cs417.group2.finalproject.logger.LogInterface;
import edu.ccsu.cs417.group2.finalproject.logger.WidgetLogDecorator;

/**
 * Concrete implementation of the abstract factory for WidgetLogDecorator class
 * @author Adam
 */
public class WidgetLogDecoratorFactory implements AbstractLogFactory {
        
    /**
     * Creates a widget log based on parameters
     * @param widget widget being logged about 
     * @param action action that occurred for widget to be logged
     * @return LogDecorator
     */
    @Override
    public LogInterface createLog(String widget, String action){
        
        // TODO add real date and time
        LogInterface l = new BasicLog(3,4);
        WidgetLogDecorator d = new WidgetLogDecorator(widget, l);
        d.setMessage(action);
        return l; 
    }
}
