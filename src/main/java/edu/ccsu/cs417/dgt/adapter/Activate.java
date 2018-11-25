package edu.ccsu.cs417.dgt.adapter;

import edu.ccsu.cs417.dgt.strategy.UserNotification;
import java.io.IOException;

/**
 * Adapter interface used for LED activation event
 * @author Tom
 */
public interface Activate {
    
    /**
     * 
     * @param notifier
     * @return
     * @throws InterruptedException
     * @throws IOException 
     */
    public String activate(UserNotification notifier) throws InterruptedException, IOException;
}
