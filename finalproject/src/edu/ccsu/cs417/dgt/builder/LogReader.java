package edu.ccsu.cs417.dgt.builder;

import edu.ccsu.cs417.dgt.logger.LogInterface;

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
    
    /**
     * Getter for the builder variable in the instance
     * @return builder variable in the instance
     */
    public LogBuilder getBuilder() {
        return builder;
    }
    
    /**
     * Returns String representation of builder and header
     * @return 
     */
    @Override
    public String toString() {
        return "LogReader:\n" + builder.toString();
    }
    
    /**
     * Creates a hash code based off builder variable
     * @return generated hash value
     */
    @Override
    public int hashCode() {
        if( builder == null ) {
            return 0;
        }
        return builder.hashCode();
    }
    
    /**
     * Checks if an object is equal to Reader object
     * @param obj object being compared to instance
     * @return boolean on whether objects are equal
     */
    @Override
    public boolean equals(Object obj) {
        boolean b = false;
        
        // makes sure object is not null
        if( obj == null ){
            return b;
        } 
        
        // check if builder variable present and equal in objects
        if( this == obj ){
            b = true;
        } else if( obj instanceof LogReader) {
            LogReader otherObj = (LogReader) obj;
            
            if( otherObj.getBuilder().equals(builder) ) {
                b = true;
            }
        }
        
        return b;
    }
}
