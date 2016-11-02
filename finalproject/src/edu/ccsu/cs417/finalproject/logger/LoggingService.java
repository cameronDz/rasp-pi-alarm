package edu.ccsu.cs417.finalproject.logger;

/**
 * Singleton class used to store Collection of widget Logs
 * @author Cameron
 */
public class LoggingService {
    
    private static LoggingService instance;
    
    /**
     * Private constructor restricts access to a single entry point for
     * service. 
     */
    private LoggingService() {
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
    
}
