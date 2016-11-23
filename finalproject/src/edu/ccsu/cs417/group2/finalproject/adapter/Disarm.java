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

/**
 * Calls a python file currently set on the desktop of the rPi
 *  which turns off an LED in port D4.
 * @author Tom
 */
public class Disarm {
    
    public int deactivate() throws IOException {
        
         // Set up the command and parameter
        // Location of the range file
        String[] cmd = new String[2];
        
        // Get operating system
        String osName = System.getProperty("os.name");
        String path;
        
        // Get .jar file parent file path
        File f = new File(System.getProperty("java.class.path"));
        File dir = f.getAbsoluteFile().getParentFile().getParentFile();

        // Note: Windows 10 returns Windows 8.1 as OS identifier
        if (osName.equals("Windows 8.1") || osName.equals("Windows 7")) {
            // For Windows based systems
            path = dir.toString() + "\\led_off.py";
            cmd[0] = "python.exe";
        } else {
            // For Linux based systems
            path = dir.toString() + "/led_off.py";
            cmd[0] = "python";
        }
        
        cmd[1] = path;

        System.out.println(path);
        
        // Create runtime to execute external command
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec(cmd);

        // Retrieve output from python script
        BufferedReader bfr = new BufferedReader(new InputStreamReader(pr.getInputStream()));
        String line = "";
        
        while((line = bfr.readLine()) != null) {
            // Display each output line from python script
            System.out.println(line);
        }
        return pr.exitValue();
    }
}
