/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.dgt.adapter;

import java.io.IOException;

/**
 * Adapter interface used for LED activation event
 * @author Tom
 */
public interface ActivateLED {
    
    public int activate() throws IOException;
    
}
