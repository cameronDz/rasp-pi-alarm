package edu.ccsu.cs417.dgt.logger;

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
     * Getter for the message variable in log
     * @return String of log message
     */
    public String getMessage();
    
    /**
     * Getter for time variable in log
     * @return int representing the time log occurred
     */
    public int getTime();
    
    /**
     * Getter for the date variable in the log
     * @return int representing the date log occurred
     */
    public int getDate();
    
    /**
     * Print out that will be used to store log.
     * @return String representing Date, Time, and message of the Log.
     */
    @Override
    public String toString();
    
    /**
     * Creates a hash code for the log 
     * @return int value of hash code
     */
    @Override
    public int hashCode();
    
    /**
     * Determines if two objects are equal
     * @param obj Object being compared to an instance of an implemented Log
     * @return boolean of whether logs are equal
     */
    @Override
    public boolean equals(Object obj);
}
