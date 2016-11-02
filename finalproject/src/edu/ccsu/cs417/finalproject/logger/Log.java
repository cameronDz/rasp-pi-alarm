package edu.ccsu.cs417.finalproject.logger;

/**
 * Class used as the bases for all widget logs. Can also be a stand alone log.
 * Currently no setters/getters since there does not seem to be any application
 * for them.
 * @author Cameron
 */
public class Log {
    protected int time;
    protected int date;
    protected String message;
    
    /**
     * Constructor with no message; message variable set to "No Message."
     * @param time Time the log occurred
     * @param date Date the log occurred
     */
    public Log(int date, int time) {
        this.date = date;
        this.time = time;
        message = "No message.";
    }
    
    /**
     * Constructor with a message for the Log.
     * @param date Date the log occurred
     * @param time Time the log occurred
     * @param message message for informing the log
     */
    public Log(int date, int time, String message) {
        this.date = date;
        this.time = time;
        this.message = message;
    }
    
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
