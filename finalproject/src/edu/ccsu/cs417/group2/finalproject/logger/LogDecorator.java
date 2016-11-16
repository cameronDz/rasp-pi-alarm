package edu.ccsu.cs417.group2.finalproject.logger;

/**
 * Abstract Log decorator class, for making LogUser and LogWidget classes.
 * @author Cameron
 */
public abstract class LogDecorator extends AbstractLog {
    
    protected final AbstractLog decoratedLog;
    protected String action;
    
    /**
     * Abstract constructor that creates an object that must extend AbstractLog
     * @param decoratedLog 
     */
    public LogDecorator(AbstractLog decoratedLog) {
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
        this.setMessage("");
    }
    
    /**
     * Gets the action that was recorded when the log occurred.
     * @return String of the action.
     */
    public String getAction() {
        return action;
    }
}
