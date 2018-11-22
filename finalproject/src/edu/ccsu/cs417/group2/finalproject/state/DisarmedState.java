/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.group2.finalproject.state;

import edu.ccsu.cs417.group2.finalproject.adapter.Arm;
import edu.ccsu.cs417.group2.finalproject.strategy.UserNotification;
import java.io.IOException;

/**
 * Class representing a disarmed security system state in the state design pattern
 * @author Tom
 */
public class DisarmedState implements DetectorState {
    
    SecuritySystem securitySystem;
    
    public DisarmedState(SecuritySystem newSecuritySystem) {
        
        securitySystem = newSecuritySystem;
        
    }
    
    /**
    * Method to arm a disarmed state in the security system. Sets the security system to 
    *  an armed state, calls the adapter method Arm() which activates the ultrasonic sensor
    *  through the python script.
    * @param notifier used to notify the user when sensor is triggered
    * @throws InterruptedException
    * @throws IOException
    */
    @Override
    public void arm(UserNotification notifier) throws InterruptedException, IOException {

        securitySystem.setDetectorState(securitySystem.getIsArmedState());
        Arm arm = new Arm();
        arm.activate(notifier);
        
        // Set disarmed state when control is passed back
        securitySystem.setDetectorState(securitySystem.getIsDisarmedState());
        
    }
    
    /**
    * Method to disarm a disarmed state in the security system.
    */
    @Override
    public void disarm() {
        
        System.out.println("System already disarmed.");
        
    }
    
}