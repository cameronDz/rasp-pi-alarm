package edu.ccsu.cs417.dgt.strategy;

import edu.ccsu.cs417.dgt.logger.BasicLog; 
import edu.ccsu.cs417.dgt.logger.LoggingService;
import java.io.IOException; 

/**
 * UserNotification used to set up strategies of notification when sensor goes
 * off.
 *
 * @author curti
 */
public class UserNotification {

    private UserNotificationStrategy strategy;

    /**
     * Constructor for a new user notification strategy
     *
     * @param strategy UserNotificationStrategy variable for UserNotification
     */
    public UserNotification(UserNotificationStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Changes the current strategy for the user notification system
     *
     * @param strategy UserNotificationStrategy variable for class to change to
     */
    public void changeStrategy(UserNotificationStrategy strategy) {
        String message = "STRATEGY " + strategy.getName().toUpperCase() + " - Activated";
        BasicLog log = new BasicLog(message);
        LoggingService.getInstance().addLog(log);
        this.strategy = strategy;
        String userMessage = "Strategy change to " + strategy.getName();
        System.out.println(userMessage);
    }

    /**
     * Executes the current strategy for user notification
     *
     * @throws java.lang.InterruptedException
     * @throws java.io.IOException
     */
    public void notifyUser() throws InterruptedException, IOException {
        strategy.execute();
    }
}
