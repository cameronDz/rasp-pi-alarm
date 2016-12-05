package edu.ccsu.cs417.group2.finalproject.factory;

import edu.ccsu.cs417.group2.finalproject.logger.BasicLog;
import edu.ccsu.cs417.group2.finalproject.logger.LogInterface;
import edu.ccsu.cs417.group2.finalproject.logger.UserLogDecorator;
import edu.ccsu.cs417.group2.finalproject.user.BasicUser;
import edu.ccsu.cs417.group2.finalproject.user.UserInterface;

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
        
        // TODO add real date and time
        LogInterface l = new BasicLog(1,2);
        UserLogDecorator d = new UserLogDecorator(u, l);
        d.setMessage(action);
        return l; 
    }
}
