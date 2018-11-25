package edu.ccsu.cs417.dgt.adapter;

import java.io.IOException;

/**
 * Class involved in buzzer adapter to call method to turn off (deactivate) buzzer
 * using same method call.
 * @author curti
 */
public class ArmAdapterBuzzer implements ActivateBuzzer {
    DisarmBuzzer action;
    
    public ArmAdapterBuzzer () {        
        action = new DisarmBuzzer();        
    }
    
    @Override
    public int activate() throws IOException {        
        return action.deactivate();        
    }
}
