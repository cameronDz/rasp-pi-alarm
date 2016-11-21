/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.group2.finalproject.adapter;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Calls a python file currently set on the desktop of the rPi
 *  which turns off an LED in port D4.
 * @author Tom
 */
public class Disarm {
    
    public int deactivate() throws IOException {
        
        // Set up the command and parameter
        // Location of the sensor file
        
        URL url = getClass().getResource("led_off.py");
        File file = new File(url.getPath());
        String[] cmd = new String[2];
        cmd[0] = "python";
        cmd[1] = file.toString();

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
