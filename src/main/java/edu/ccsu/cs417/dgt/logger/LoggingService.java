package edu.ccsu.cs417.dgt.logger;

import edu.ccsu.cs417.dgt.builder.JsonLogBuilder;
import edu.ccsu.cs417.dgt.builder.LogReader;
import java.util.Iterator;

/**
 * Singleton class used to store Collection of widget Logs. No implementation of
 * hashCode() or equals(Object obj) function since singleton design pattern will
 * always be referencing the same object through out entire application.
 * @author Cameron
 */
public class LoggingService {
    
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
     * @param l Log being added to the collection
     */
    public void addLog(LogInterface l) {
        logs.addLog(l);
    }
    
    public void deleteLog() {
        logs = new LogCollection();
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
     * Return a 'pretty' JSON string to command line of the logs.
     * @return String of JSON for logs
     */
    public String toJson() {
        StringBuilder sb = new StringBuilder();
        JsonLogBuilder builder = new JsonLogBuilder();
        LogReader reader = new LogReader(builder);
        Iterator<LogInterface> logIterator = logs.iterator();
        // begin creating json
        sb.append("[\n");
        while(logIterator.hasNext()) {
            reader.parseLog(logIterator.next());
            sb.append("    ");
            sb.append(builder.getJsonLog());
            if(logIterator.hasNext()){
                sb.append(",");
            } 
            sb.append("\n");
        }
        sb.append("]\n");
        return sb.toString();
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
