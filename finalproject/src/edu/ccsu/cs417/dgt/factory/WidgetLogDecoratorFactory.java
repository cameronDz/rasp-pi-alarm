package edu.ccsu.cs417.dgt.factory;

import edu.ccsu.cs417.dgt.logger.BasicLog;
import edu.ccsu.cs417.dgt.logger.LogInterface;
import edu.ccsu.cs417.dgt.logger.WidgetLogDecorator;
import java.util.Date;
import java.util.GregorianCalendar;

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
        
        Date loadTime = new Date();
        GregorianCalendar x = new GregorianCalendar();
                    int date = (x.get(GregorianCalendar.DAY_OF_MONTH)) + 
                            (x.get(GregorianCalendar.MONTH) + 1) *100 +
                            x.get(GregorianCalendar.YEAR) *10000;
                    int time = loadTime.getHours() * 10000;
                    time += loadTime.getMinutes() * 100;
                    time += loadTime.getSeconds();
        
        LogInterface l = new BasicLog(date,time);
        WidgetLogDecorator d = new WidgetLogDecorator(widget, l);
        d.setMessage(action);
        return l; 
    }
}
