/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.group2.finalproject.state;

import edu.ccsu.cs417.group2.finalproject.strategy.UserNotification;

/**
 * Class representing an armed security system state in the state design pattern
 * @author Tom
 */
public class ArmedState implements DetectorState {
    
    SecuritySystem securitySystem;
    
    public ArmedState(SecuritySystem newSecuritySystem) {
        
        securitySystem = newSecuritySystem;
        
    }

    /**
    * Method to arm an armed state in the security system.
    * @param notifier used to notify the user when sensor is triggered
    */
    @Override
    public void arm(UserNotification notifier) {
        
        System.out.println("System is already armed.");
        
    }
    
    /**
    * Method to disarm an armed state in the security system.
    */
    @Override
    public void disarm() {
        
        securitySystem.setDetectorState(securitySystem.getIsDisarmedState());
        
    }
    
}
