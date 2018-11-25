/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.dgt.adapter;

import java.io.IOException;

/**
 * Adapter interface used for buzzer activation event
 * @author curti
 */
public interface ActivateBuzzer {
    
    public int activate() throws IOException;
    
}