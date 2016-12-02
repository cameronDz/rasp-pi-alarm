
package edu.ccsu.cs417.group2.finalproject.strategy;

/**
 * When sensor goes off, update logs and notify user while activating buzzer
 * @author curti
 */
public class BuzzerStrategy implements UserNotificationStrategy {
    
    /**
     * Notifies the user that the ranger detected something and sets off buzzer
     */
    @Override
    public void execute() {
        //TODO implement BuzzerStrategy's execute
        System.out.println("Buzzer strategy went off.");
    }
    
}
