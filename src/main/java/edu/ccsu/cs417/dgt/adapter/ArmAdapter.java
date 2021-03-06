package edu.ccsu.cs417.dgt.adapter;

import edu.ccsu.cs417.dgt.strategy.UserNotification;
import java.io.IOException;

/**
 * Adapter pattern class to call for deactivation of Ultrasonic sensor
 *  using same method call.
 * @author Tom
 */
public class ArmAdapter implements Activate {
    
    Disarm action;
    
    public ArmAdapter () {        
        action = new Disarm();        
    }
    
    @Override
    public String activate(UserNotification notifier) throws IOException {        
        return action.deactivate();        
    }    
}
