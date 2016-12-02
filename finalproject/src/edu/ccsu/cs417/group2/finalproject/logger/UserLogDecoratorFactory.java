package edu.ccsu.cs417.group2.finalproject.logger;

import edu.ccsu.cs417.group2.finalproject.user.UserInterface;

/**
 * Class UserLogDecoratorFactory is a concrete 
 * implementation of the abstract factory for UserLogDecorator class
 * @author Adam
 */
public class UserLogDecoratorFactory implements LogDecoratorAbstractFactory {
    
    private UserInterface user;
    private final BasicLog decoratedLog;
    /**
     * Constructor for the class
     * @param user UserInterface Instance of a UserInterface class used to create the UserLogDecorator
     * @param decoratedLog BasicLog Instance of a basic log which will be decorated
     */
    public UserLogDecoratorFactory(UserInterface user, BasicLog decoratedLog) {
        this.user = user;
        this.decoratedLog = decoratedLog;
    }
    /**
     * Function createLogDecorator lets you obtain a concrete product - UserLogDecorator
     * @return LogDecorator
     */
    @Override
    public LogDecorator createLogDecorator(){
        return new UserLogDecorator(user, decoratedLog);
    }
}
