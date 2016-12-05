/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.group2.finalproject.adapter;

import edu.ccsu.cs417.group2.finalproject.strategy.UserNotification;
import java.io.IOException;

/**
 * Adapter pattern class to call for deactivation of Ultrasonic sensor
 *  using same method call.
 * @author Tom
 */
public class ArmAdapter implements Activate {
    
    Disarm action;
    
    public ArmAdapter () {
        
        action = new Disarm();
        
    }
    
    @Override
    public String activate(UserNotification notifier) throws IOException {
        
        return action.deactivate();
        
    }
    
}
