/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.group2.finalproject.state;

import edu.ccsu.cs417.group2.finalproject.strategy.UserNotification;
import java.io.IOException;

/**
 *  SecuritySystem class in the state design pattern representing
 *  the context of the security system.
 * @author Tom
 */
public class SecuritySystem {
    
    DetectorState detectorState;
    
    DetectorState armed;
    DetectorState disarmed;
    
    public SecuritySystem() {
        
        armed = new ArmedState(this);
        disarmed = new DisarmedState(this);
        
        detectorState = disarmed;
        
    }
    
    /**
     *  Setter method to set the security system current state
     * @param takes interface for armed/disarmed state
     */
    void setDetectorState(DetectorState newDetectorState) {
        
        detectorState = newDetectorState;
        
    }
    
    /**
     *  Method to call arming of the system state
     * @param notifier used to notify the user when sensor is triggered
     * @throws InterruptedException
     * @throws IOException
     */
    public void arm(UserNotification notifier) throws InterruptedException, IOException {
        
        detectorState.arm(notifier);
        
    }
    
    /**
     *  Method to call disarming of the system state
     */
    public void disarm() {
        
        detectorState.disarm();
        
    }
    
    // Returns the state of the system
    public DetectorState getIsArmedState() { return armed; }
    public DetectorState getIsDisarmedState() { return disarmed; }
    
}
