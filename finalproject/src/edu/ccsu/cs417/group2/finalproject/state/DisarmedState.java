/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.group2.finalproject.state;

import edu.ccsu.cs417.group2.finalproject.adapter.Arm;
import edu.ccsu.cs417.group2.finalproject.adapter.ArmLED;
import java.io.IOException;

/**
 *
 * @author Tom
 */
public class DisarmedState implements DetectorState {
    
    SecuritySystem securitySystem;
    
    public DisarmedState(SecuritySystem newSecuritySystem) {
        
        securitySystem = newSecuritySystem;
        
    }
    
    @Override
    public void arm() throws IOException {
        
        
        String widget = "";
        
        while (!widget.equals("button")) {
        
            securitySystem.setDetectorState(securitySystem.getIsArmedState());
            Arm arm = new Arm();
            widget = arm.activate();
        
        }
        
        // Set disarmed state when control is passed back
        securitySystem.setDetectorState(securitySystem.getIsDisarmedState());
        
        // Activate red LED for disarmed state
        // ArmLED armLED = new ArmLED();
        // armLED.activate(red);
        
    }
    
    @Override
    public void disarm() {
        
        System.out.println("System already disarmed.");
        
    }
    
}
