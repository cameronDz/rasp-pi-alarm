/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.group2.finalproject.state;

import edu.ccsu.cs417.group2.finalproject.strategy.UserNotification;

/**
 *
 * @author Tom
 */
public class ArmedState implements DetectorState {
    
    SecuritySystem securitySystem;
    
    public ArmedState(SecuritySystem newSecuritySystem) {
        
        securitySystem = newSecuritySystem;
        
    }
    
    @Override
    public void arm(UserNotification notifier) {
        
        System.out.println("System is already armed.");
        
    }
    
    @Override
    public void disarm() {
        
        // Activate red LED for disarmed state
        // ArmLED armLED = new ArmLED();
        // armLED.activate(red);
        securitySystem.setDetectorState(securitySystem.getIsDisarmedState());
        
    }
    
}
