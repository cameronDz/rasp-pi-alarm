package edu.ccsu.cs417.group2.finalproject.factory;

import edu.ccsu.cs417.group2.finalproject.logger.BasicLog;
import edu.ccsu.cs417.group2.finalproject.logger.LogInterface;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Class used to interact with the Abstract Factory
 * @author Adam
 */
public class BasicLogFactory implements AbstractLogFactory {
    /**
     * Function getLogDecorator lets you obtain a LogDecorator
     * @param message message for a basic log
     * @param empty empty parameter, only purpose is to override interface
     * @return LogInterface log being created
     */
    @Override
    public LogInterface createLog(String message, String empty) {
        
        Date loadTime = new Date();
        GregorianCalendar x = new GregorianCalendar();
                    int date = (x.get(GregorianCalendar.DAY_OF_MONTH)) + 
                            (x.get(GregorianCalendar.MONTH) + 1) *100 +
                            x.get(GregorianCalendar.YEAR) *10000;
                    int time = loadTime.getHours() * 10000;
                    time += loadTime.getMinutes() * 100;
                    time += loadTime.getSeconds();
        
        LogInterface l = new BasicLog(date,time,message);
        return l;
    }
}
