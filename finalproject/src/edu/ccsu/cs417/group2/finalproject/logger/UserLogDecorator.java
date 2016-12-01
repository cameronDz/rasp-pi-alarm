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
    public UserLogDecorator(UserInterface user, BasicLog decoratedLog) {
        super(decoratedLog);
        this.user = user;
    }
        
    /**
     * Sets the message which is ultimately printed after the time/date when
     * the toString method is called on the AbstractLog object.
     * @param s String to be set to message variable on decorated log
     */
    @Override
    public void setMessage(String s) {
        s = "USER: " + user.toString() + " PERFORMED: " + s;
        this.decoratedLog.setMessage(s);
    }
    
    /**
     * Getter for user variable
     * @return User associated with log
     */
    public UserInterface getUser() {
        return this.user;
    }
    
    /**
     * Creates hash code value for the log
     * @return integer of the hash code value
     */
    @Override
    public int hashCode() {
        int i = super.hashCode();
        
        i += this.user.hashCode();
        
        return i;
    }
    
    /**
     * Goes through all variables and checks that they are all equal
     * @param obj Object being compared
     * @return boolean on whether obj is equal to an instance
     */
    @Override
    public boolean equals(Object obj) {
        boolean b = false; 
        
        // makes sure object is not null 
        if( obj == null ){
            return b;
        } 
        
        // logic checking all variables of two objects are equal
        if( this == obj ){
            b = true;
        } else if( obj instanceof UserLogDecorator) {
            UserLogDecorator otherObj = (UserLogDecorator) obj;
            
            // checks all variables and runs super check
            if( otherObj.getUser().equals(this.getUser()) && 
                    super.equals(obj) ) {
                b = true;
            }
        }
        
        return b;
    }
}
