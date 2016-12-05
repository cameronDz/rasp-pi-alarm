
package edu.ccsu.cs417.group2.finalproject.strategy;

import java.io.IOException;

/**
 * Interface that all strategies will implement
 * @author curti
 */

public interface UserNotificationStrategy {
    
    /**
     * Used to execute the strategy for user notification
     */
    void execute() throws InterruptedException, IOException;
    
}
