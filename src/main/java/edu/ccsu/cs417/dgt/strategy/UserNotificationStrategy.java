package edu.ccsu.cs417.dgt.strategy;

import java.io.IOException;

/**
 * Interface that all strategies will implement
 * @author curti
 */
public interface UserNotificationStrategy {
    
    /**
     * Used to execute the strategy for user notification
     * @throws java.lang.InterruptedException
     * @throws java.io.IOException
     */
    void execute() throws InterruptedException, IOException;    
}
