package edu.ccsu.cs417.group2.finalproject.logger;

/**
 * Interface used for Basic Logs and and Decorated Logs
 * @author Cameron
 */
public interface LogInterface {
    
    /**
     * Used to display message after time and date in a Log
     * @param s String message variable to be set
     */
    public void setMessage(String s);
    
    /**
     * Print out that will be used to store log.
     * @return String representing Date, Time, and message of the Log.
     */
    @Override
    public String toString();
}
