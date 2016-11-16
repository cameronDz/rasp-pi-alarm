package edu.ccsu.cs417.group2.finalproject.logger;

/**
 * Abstract Log class for all Logs to be based off.
 * @author Cameron
 */
public abstract class AbstractLog implements LogInterface { 
    protected int time;
    protected int date;
    protected String message;
    
    /**
     * Sets the message that is displayed after the time/date of the log.
     * @param s String message variable to be set
     */
    @Override
    public abstract void setMessage(String s);
        
    /**
     * Print out that will be used to store log.
     * @return String representing Date, Time, and message of the Log.
     */
    @Override 
    public String toString() {
        String s = "";        
        s += date + " ";
        s += time + " ";
        s += message;        
        return s;
    } 
}
