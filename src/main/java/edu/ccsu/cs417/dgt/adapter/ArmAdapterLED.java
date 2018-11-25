package edu.ccsu.cs417.dgt.adapter;

import java.io.IOException;

/**
 * Class involved in LED adapter to call method to turn off (deactivate) LED
 * using same method call.
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
