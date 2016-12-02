
package edu.ccsu.cs417.group2.finalproject.strategy;

/**
 * When sensor goes off, update logs and notify user without activating any other pi sensors
 * @author curti
 */
public class SilentStrategy implements UserNotificationStrategy {
    
    /**
     * Notifies the user that the ranger detected something
     */
    @Override
    public void execute() {
        //TODO implement SilentStrategy's execute
        System.out.println("Silent strategy went off.");
    }
    
}
