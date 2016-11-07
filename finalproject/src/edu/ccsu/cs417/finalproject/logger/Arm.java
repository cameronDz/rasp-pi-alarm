/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.finalproject.logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Calls a python file currently set on the desktop of the rPi
 *  which lights an LED in port D4.
 * @author Tom
 */
public class Arm implements Activate {
    
    @Override
    public int activate() throws IOException {
        
        // Set up the command and parameter
        // Location of the LED files on PI
        String pythonScriptPath = "/home/pi/Desktop/led_on.py";
        String[] cmd = new String[2];
        cmd[0] = "python";
        cmd[1] = pythonScriptPath;

        // create runtime to execute external command
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec(cmd);

        // retrieve output from python script
        BufferedReader bfr = new BufferedReader(new InputStreamReader(pr.getInputStream()));
        String line = "";
        
        while((line = bfr.readLine()) != null) {
        // display each output line from python script
        System.out.println(line);
        }
        return pr.exitValue();
    }
    
}
