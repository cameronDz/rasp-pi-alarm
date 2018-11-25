package edu.ccsu.cs417.dgt.state;

import edu.ccsu.cs417.dgt.strategy.UserNotification;
import java.io.IOException;

/**
 * An interface for the security system states that are expected.
 * Part of state design pattern.
 * @author Tom
 */
public interface DetectorState {
    
    /**
     * 
     * @param notifier
     * @throws InterruptedException
     * @throws IOException 
     */
    void arm(UserNotification notifier) throws InterruptedException, IOException;
    
    /**
     * 
     */
    void disarm();    
}
