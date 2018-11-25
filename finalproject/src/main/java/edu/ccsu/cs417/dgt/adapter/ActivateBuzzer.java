package edu.ccsu.cs417.dgt.adapter;

import java.io.IOException;

/**
 * Adapter interface used for buzzer activation event
 * @author curti
 */
public interface ActivateBuzzer {
    
    /**
     * 
     * @return
     * @throws IOException 
     */
    public int activate() throws IOException;    
}
