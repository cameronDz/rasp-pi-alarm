package edu.ccsu.cs417.dgt.adapter;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * DisarmBuzzer class implements ActivateBuzzer interface in adapter pattern to deactivate a buzzer
 * @author curti
 */
public class DisarmBuzzer {
    
    /**
     *  Method activate() collects system type information to create an appropriate runtime
     *  environment which invokes a Python script. Feedback from the script is passed 
     *  back to the method.
     * @throws IOException
     * @return integer 0 upon completion
     */
    public int deactivate() throws IOException {
        
        // Set up the command and parameter
        // Location of the buzzer file
        String[] cmd = new String[2];
        
        // Get operating system
        String osName = System.getProperty("os.name");
        
        // Get .jar file parent file path
        File f = new File(System.getProperty("java.class.path"));
        File dir = f.getAbsoluteFile().getParentFile().getParentFile();

        // Note: Windows 10 returns Windows 8.1 as OS identifier
        if (osName.equals("Windows 8.1") || osName.equals("Windows 7")) {
            // For Windows based systems
            cmd[0] = "python.exe";
            cmd[1] = dir.toString() + "\\src\\main\\python\\buzzer_off.py";
        } else {
            // For Linux based systems
            cmd[0] = "python";
            cmd[1] = dir.toString() + "/src/main/python/buzzer_off.py";
        }
        
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

        return 0;
    }
    
}
