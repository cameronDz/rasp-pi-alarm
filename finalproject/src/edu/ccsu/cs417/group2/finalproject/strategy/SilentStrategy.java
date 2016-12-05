
package edu.ccsu.cs417.group2.finalproject.strategy;

import edu.ccsu.cs417.group2.finalproject.adapter.ArmLED;
import edu.ccsu.cs417.group2.finalproject.adapter.DisarmLED;
import java.io.IOException;

/**
 * When sensor goes off, update logs and notify user without activating any other pi sensors
 * @author curti
 */
public class SilentStrategy  implements UserNotificationStrategy  {
    
    /**
     * Notifies, through the terminal, the user that the ranger detected something 
     */
    @Override
    public void execute() throws InterruptedException, IOException {
        
        System.out.println("Intruder detected!");
        
    }
    
}
