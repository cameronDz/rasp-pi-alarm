package edu.ccsu.cs417.dgt.builder;

/**
 * Used to read and convert logs to various (JSON) string representations
 * @author Cameron
 */
public interface LogBuilder {
    
    /**
     * Gets the time stamp from a Log and converts it for output
     * @param time int timestamp of a Log
     */
    public void buildTime(int time);
    
    /**
     * Gets the date of a Log and converts it for output
     * @param date int date of a Log
     */
    public void buildDate(int date);
    
    /**
     * Gets the message of a Log and converts it for output
     * @param message String message of a Log
     */
    public void buildMessage(String message);
}
