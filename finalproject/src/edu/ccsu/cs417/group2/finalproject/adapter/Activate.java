/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.group2.finalproject.adapter;

import java.io.IOException;

/**
 * Adapter interface used for LED activation event
 * @author Tom
 */
public interface Activate {
    
    public String activate() throws IOException;
    
}
