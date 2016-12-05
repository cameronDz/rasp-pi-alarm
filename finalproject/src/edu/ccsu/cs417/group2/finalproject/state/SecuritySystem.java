/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.group2.finalproject.state;

import edu.ccsu.cs417.group2.finalproject.strategy.UserNotification;
import java.io.IOException;

/**
 *
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
        // Activate red LED for disarmed state
        // ArmLED armLED = new ArmLED();
        // armLED.activate(red);
        
    }
    
    void setDetectorState(DetectorState newDetectorState) {
        
        detectorState = newDetectorState;
        
    }
    
    public void arm(UserNotification notifier) throws InterruptedException, IOException {
        
        detectorState.arm(notifier);
        
    }
    
    public void disarm() {
        
        detectorState.disarm();
        
    }
    
    public DetectorState getIsArmedState() { return armed; }
    public DetectorState getIsDisarmedState() { return disarmed; }
    
}
