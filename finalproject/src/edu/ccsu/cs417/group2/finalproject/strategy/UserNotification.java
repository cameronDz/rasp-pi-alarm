/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.group2.finalproject.strategy;

/**
 *
 * @author curti
 */
public class UserNotification {
    
    private UserNotificationStrategy strategy;
    
    public UserNotification(UserNotificationStrategy strategy) {
        this.strategy = strategy;
    }
    
    public void changeStrategy(UserNotificationStrategy strategy) {
        this.strategy = strategy;
    }
    
    public void notifyUser() {
        strategy.execute();
    }
}
