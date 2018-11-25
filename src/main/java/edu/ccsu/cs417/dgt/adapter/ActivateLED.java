package edu.ccsu.cs417.dgt.adapter;

import java.io.IOException;

/**
 * Adapter interface used for LED activation event
 * @author Tom
 */
public interface ActivateLED {
    
    /**
     * 
     * @return
     * @throws IOException 
     */
    public int activate() throws IOException;
}
