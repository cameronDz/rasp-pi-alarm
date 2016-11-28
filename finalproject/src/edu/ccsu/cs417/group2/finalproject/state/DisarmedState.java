/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.group2.finalproject.state;

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
    public void arm() {
        
        
        
    }
    
    @Override
    public void disarm() {
        
        
        
    }
    
}
