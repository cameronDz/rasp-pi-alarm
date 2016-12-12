package edu.ccsu.cs417.group2.finalproject.factory;

import edu.ccsu.cs417.group2.finalproject.logger.LogInterface;

/**
 * Interface used for creating Log factories
 * @author Adam 
 */
public interface AbstractLogFactory {
    
    /**
     * Method which needs to be implemented for each concrete factory 
     * @param first depending on log type being created, information about log
     * @param second additional information about the log to be created
     * @return LogInterface Log returned from the factory
     */
    public LogInterface createLog(String first, String second);
}
