package edu.ccsu.cs417.group2.finalproject.logger;

/**
 * Singleton class used to store Collection of widget Logs. No implementation of
 * hashCode() or equals(Object obj) function since singleton design pattern will
 * always be referencing the same object through out entire application.
 * @author Cameron
 * @param <T> Log that is extends from the AbstractLog class
 */
public class LoggingService<T extends BasicLog> {
    
    private static LoggingService instance;
    protected LogCollection logs;
    
    /**
     * Private constructor restricts access to a single entry point for
     * service. Initializes the Log Collection.
     */
    private LoggingService() {
        logs = new LogCollection();
    }
    
    /**
     * Public access point of LoggingService singleton. If it is has not been
     * initialized, a new instance of class is created and returned. 
     * @return singleton instance of the LoggingService class
     */
    public static LoggingService getInstance() {
        if( instance == null ) {
            instance = new LoggingService();
        }
        return instance;
    }
    
    /**
     * Adds a log to the Collection of Logs being held by the service
     * @param t Log being added to the collection
     */
    public void addLog(T t) {
        logs.addLog(t);
    }
    
    /**
     * Calls the LogCollections toString() method to return a String 
     * representation of all the Logs 
     * @return a list of all the logs
     */
    public LogCollection getLogs() {
        return logs;
    }
    
    /**
     * Calls the getLogs() method to return all the Logs that have been recorded
     * @return String representation of all the Logs
     */
    @Override 
    public String toString() {
        return this.getLogs().toString();
    }
}
