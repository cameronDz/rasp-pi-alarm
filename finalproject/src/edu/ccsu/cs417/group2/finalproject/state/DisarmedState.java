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

        securitySystem.setDetectorState(securitySystem.getIsArmedState());
        Arm arm = new Arm();
        arm.activate();
        
        // Set disarmed state when control is passed back
        securitySystem.setDetectorState(securitySystem.getIsDisarmedState());
        
    }
    
    @Override
    public void disarm() {
        
        System.out.println("System already disarmed.");
        
    }
    
}
