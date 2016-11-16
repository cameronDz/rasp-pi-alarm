package edu.ccsu.cs417.group2.finalproject.logger;

import edu.ccsu.cs417.group2.finalproject.user.UserInterface;
/**
 * Log that details a Users action
 * @author Cameron
 */
public class UserLogDecorator extends LogDecorator {
    
    protected UserInterface user;
    
    /**
     * Constructor for abstract object.
     * @param decoratedLog object being wrapped by class
     * @param user user object being logged
     */
    public UserLogDecorator(UserInterface user, AbstractLog decoratedLog) {
        super(decoratedLog);
        this.user = user;
        this.setMessage("");
    }
        
    /**
     * Sets the message which is ultimately printed after the time/date when
 the toString method is called on the AbstractLog object.
     * @param s String to be set to message variable on decorated log
     */
    @Override
    public void setMessage(String s) {
        s = "USER: " + user.toString() + " PERFORMED: " + action;
        this.decoratedLog.setMessage(s); 
    }
}
