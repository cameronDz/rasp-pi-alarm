package edu.ccsu.cs417.dgt.strategy;

import edu.ccsu.cs417.dgt.adapter.ArmBuzzer;
import edu.ccsu.cs417.dgt.adapter.ArmLED;
import edu.ccsu.cs417.dgt.adapter.DisarmBuzzer;
import edu.ccsu.cs417.dgt.adapter.DisarmLED;
import java.io.IOException;

/**
 * When sensor goes off, update logs and notify user while activating buzzer
 * @author curti
 */
public class BuzzerStrategy implements UserNotificationStrategy {
    
    /**
     * Notifies the user that the ranger detected something and sets off buzzer
     */
    @Override
    public void execute() throws InterruptedException, IOException {
        ArmLED redOn = new ArmLED();
        DisarmLED redOff = new DisarmLED();
        ArmBuzzer buzOn = new ArmBuzzer();
        DisarmBuzzer buzOff = new DisarmBuzzer();
        
        System.out.println("Intruder detected, sound the alarm!");
        
        redOn.activate();
        buzOn.activate();
        Thread.sleep(100);
        redOff.deactivate();
        buzOff.deactivate();
    }
    
    @Override
    public String getName() {
        return "BUZZER";
    }
}
