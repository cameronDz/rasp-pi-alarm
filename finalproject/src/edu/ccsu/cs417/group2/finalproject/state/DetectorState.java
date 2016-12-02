/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.group2.finalproject.state;

import java.io.IOException;

/**
 * An interface for the security system states that are expected.
 *  Part of state design pattern.
 * @author Tom
 */
public interface DetectorState {
    
    void arm() throws IOException;
    void disarm();
    
}
