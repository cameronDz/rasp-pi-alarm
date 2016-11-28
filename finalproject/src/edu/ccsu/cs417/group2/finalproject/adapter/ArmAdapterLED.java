/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.group2.finalproject.adapter;

import java.io.IOException;

/**
 * Class involved in LED adapter to call method to turn off (deactivate) LED
 *  using same method call.
 * @author Tom
 */
public class ArmAdapterLED implements ActivateLED {
    
        DisarmLED action;
    
    public ArmAdapterLED () {
        
        action = new DisarmLED();
        
    }
    
    @Override
    public int activate() throws IOException {
        
        return action.deactivate();
        
    }
    
}
