/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.dgt.adapter;

import edu.ccsu.cs417.dgt.strategy.UserNotification;
import java.io.IOException;

/**
 * Adapter interface used for LED activation event
 * @author Tom
 */
public interface Activate {
    
    public String activate(UserNotification notifier) throws InterruptedException, IOException;
    
}
