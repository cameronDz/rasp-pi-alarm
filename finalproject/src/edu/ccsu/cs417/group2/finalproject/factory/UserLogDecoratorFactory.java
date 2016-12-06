package edu.ccsu.cs417.group2.finalproject.factory;

import edu.ccsu.cs417.group2.finalproject.logger.BasicLog;
import edu.ccsu.cs417.group2.finalproject.logger.LogInterface;
import edu.ccsu.cs417.group2.finalproject.logger.UserLogDecorator;
import edu.ccsu.cs417.group2.finalproject.user.BasicUser;
import edu.ccsu.cs417.group2.finalproject.user.UserInterface;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Concrete implementation of the abstract factory for UserLogDecorator class
 * @author Adam
 */
public class UserLogDecoratorFactory implements AbstractLogFactory {
    
    /**
     * Function createLog lets you obtain a concrete product - UserLogDecorator
     * @param user String of user name being passed in to log
     * @param action Action the user did for log to occur
     * @return LogInterface new decorated log
     */
    @Override
    public LogInterface createLog(String user, String action){
        
        UserInterface u = new BasicUser(user);
        
        Date loadTime = new Date();
        GregorianCalendar x = new GregorianCalendar();
                    int date = (x.get(GregorianCalendar.DAY_OF_MONTH)) + 
                            (x.get(GregorianCalendar.MONTH) + 1) *100 +
                            x.get(GregorianCalendar.YEAR) *10000;
                    int time = loadTime.getHours() * 10000;
                    time += loadTime.getMinutes() * 100;
                    time += loadTime.getSeconds();
        
        LogInterface l = new BasicLog(date,time);
        UserLogDecorator d = new UserLogDecorator(u, l);
        d.setMessage(action);
        return l; 
    }
}
