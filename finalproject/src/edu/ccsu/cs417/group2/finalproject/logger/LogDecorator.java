package edu.ccsu.cs417.group2.finalproject.logger;

/**
 * Abstract Log decorator class, for making User and Widget Logs.
 * @author Cameron
 */
public abstract class LogDecorator implements LogInterface {
    
    protected final LogInterface decoratedLog;
    protected String action;
    
    /**
     * Abstract constructor that creates an object that must extend AbstractLog
     * @param decoratedLog 
     */
    public LogDecorator(BasicLog decoratedLog) {
        this.decoratedLog = decoratedLog;
    }
    
    /**
     * Decorated Logs will use this method to set the message
     * @param s String to be set to message variable on decorated log
     */
    @Override
    public abstract void setMessage(String s);
    
    /**
     * Sets the String representation for the action that occurred for the 
     * Log to be triggered.
     * @param s action description
     */
    public void setAction(String s) {
        this.action = s;
        this.setMessage(action);
    }
    
    /**
     * Gets the action that was recorded when the log occurred.
     * @return String of the action.
     */
    public String getAction() {
        return action;
    }
    
    /**
     * Getter for message variable, call to decoratedLog
     * @return String of log message
     */
    @Override
    public String getMessage() {
        return this.decoratedLog.getMessage();
    }
    
    /**
     * Getter for time variable, call to decoratedLog
     * @return int of time log occurred
     */
    @Override
    public int getTime() {
        return this.decoratedLog.getTime();
    }
    
    /**
     * Getter for date variable, call to decoratedLog
     * @return int of date log occurred
     */
    @Override
    public int getDate() {
        return this.decoratedLog.getDate();
    }
    /**
     * Calls decoratedLog toString method and returns that string
     * @return the String of the decoratedLog
     */
    
    /**
     * Getter for decoratedLog
     * @return the objects decoratedLog
     */
    public LogInterface getDecoratedLog() {
        return this.decoratedLog;
    }
    
    @Override
    public String toString() {
        return this.decoratedLog.toString();
    }
    
    /**
     * Creates a hash code function to be implemented in all children classes
     * @return integer value of hash code
     */
    @Override
    public int hashCode() {
        int i = 0;
        
        i += action.hashCode();
        i += decoratedLog.hashCode();
        
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
        } else if( obj instanceof LogDecorator) {
            LogDecorator otherObj = (LogDecorator) obj;
            if( otherObj.getAction().equals(this.getAction()) && 
                    otherObj.getDecoratedLog().equals(this.getDecoratedLog()) ) {
                b = true;
            }
        }
        
        return b;
    }
}
