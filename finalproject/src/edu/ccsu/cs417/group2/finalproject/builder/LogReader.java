package edu.ccsu.cs417.group2.finalproject.builder;

import edu.ccsu.cs417.group2.finalproject.logger.LogInterface;

/**
 * Used to read logs and create objects using LogBuilder interface
 * @author Cameron
 */
public class LogReader {
    protected LogBuilder builder;
    
    /**
     * Contracted the LogReader to create a LogBuilder
     * @param obj Object that will build a Log representation
     */
    public LogReader(LogBuilder obj) {
        this.builder = obj;
    }
    
    /**
     * Builds a LogInterface through the LogBuilderInterface
     * @param log 
     */
    public void parseLog(LogInterface log) {
        this.builder.buildDate(log.getDate());
        this.builder.buildTime(log.getTime());
        this.builder.buildMessage(log.getMessage());
    }
}
