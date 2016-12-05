
package edu.ccsu.cs417.group2.finalproject.strategy;

import java.io.IOException;

/**
 * UserNotification used to set up strategies of notification when sensor goes off.
 * @author curti
 */
public class UserNotification {
    
    private UserNotificationStrategy strategy;
    
    /**
     * Constructor for a new user notification strategy
     * @param strategy UserNotificationStrategy variable for UserNotification
     */
    public UserNotification(UserNotificationStrategy strategy) {
        this.strategy = strategy;
    }
    
    /**
     * Changes the current strategy for the user notification system
     * @param strategy UserNotificationStrategy variable for class to change to
     */
    public void changeStrategy(UserNotificationStrategy strategy) {
        this.strategy = strategy;
    }
    
    /**
     * Executes the current strategy for user notification
     */
    public void notifyUser() throws InterruptedException, IOException {
        strategy.execute();
    }
}
