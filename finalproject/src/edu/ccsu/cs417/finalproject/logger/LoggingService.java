package edu.ccsu.cs417.finalproject.logger;

/**
 * Singleton class used to store Collection of widget Logs
 * @author Cameron
 */
public class LoggingService {
    
    private static LoggingService instance;
    private static LogCollection logs;
    
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
     * @param l Log being added to the collection
     */
    public void addLog(Log l) {
        logs.addLog(l);
    }
}
