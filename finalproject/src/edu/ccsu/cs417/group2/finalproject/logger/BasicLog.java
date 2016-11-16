package edu.ccsu.cs417.group2.finalproject.logger;

/**
 * Class used as the bases for all widget logs. Can also be a stand alone log.
 * Currently no setters/getters since there does not seem to be any application
 * for them.
 * @author Cameron
 */
public class BasicLog extends AbstractLog {
    
    /**
     * Constructor with no message; message variable set to "No Message."
     * @param time Time the log occurred
     * @param date Date the log occurred
     */
    public BasicLog(int date, int time) {
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
    public BasicLog(int date, int time, String message) {
        this.date = date;
        this.time = time;
        this.message = message;
    }
    
    /**
     * Sets the message of the Log to the String in parameter
     * @param s String to be set to message variable
     */
    @Override
    public void setMessage(String s) {
        this.message = s;
    }    
}
