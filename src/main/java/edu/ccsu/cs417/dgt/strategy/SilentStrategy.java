package edu.ccsu.cs417.dgt.strategy;

import java.io.IOException;

/**
 * When sensor goes off, update logs and notify user without activating any other pi sensors
 * @author curti
 */
public class SilentStrategy  implements UserNotificationStrategy  {
    
    /**
     * Notifies, through the terminal, the user that the ranger detected something 
     * @throws java.lang.InterruptedException
     * @throws java.io.IOException
     */
    @Override
    public void execute() throws InterruptedException, IOException {
        System.out.println("Intruder detected!");        
    }
}
