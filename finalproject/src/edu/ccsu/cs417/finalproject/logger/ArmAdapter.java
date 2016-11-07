/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.finalproject.logger;

import java.io.IOException;

/**
 * Adapter class to call for deactivation of LED
 *  using same method call.
 * @author Tom
 */
public class ArmAdapter implements Activate {
    
    Disarm action;
    
    public ArmAdapter () {
        
        action = new Disarm();
        
    }
    
    @Override
    public int activate() throws IOException {
        
        return action.deactivate();
        
    }
    
}
