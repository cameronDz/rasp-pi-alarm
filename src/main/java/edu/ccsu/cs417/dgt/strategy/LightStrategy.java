/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.dgt.strategy;

import edu.ccsu.cs417.dgt.adapter.ArmLED;
import edu.ccsu.cs417.dgt.adapter.DisarmLED;
import java.io.IOException;

/**
 * When sensor goes off, update logs and notify user while activating red LED
 * @author curti
 */
public class LightStrategy implements UserNotificationStrategy {
    
        /**
         * Notifies the user that the sensor has been tripped by lighting up the red LED
         */
        @Override
        public void execute() throws InterruptedException, IOException {
            ArmLED redOn = new ArmLED();
            DisarmLED redOff = new DisarmLED();
        
            System.out.println("Intruder detected, red alert!");
        
            redOn.activate();
            Thread.sleep(100);
            redOff.deactivate();
        }
}
