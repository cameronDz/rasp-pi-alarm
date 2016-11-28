/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.group2.finalproject.adapter;

/**
 * Returns a statement to press button on rPi to deactivate
 *  system. Part of the adapter design pattern for ultrasonic sensor system.
 * @author Tom
 */
public class Disarm {
    
    public int deactivate() {
        
        System.out.println("Press Button to Deactivate System");
        
        return -1;
    }
}
