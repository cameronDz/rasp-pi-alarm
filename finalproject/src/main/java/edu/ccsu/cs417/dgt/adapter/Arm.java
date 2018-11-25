package edu.ccsu.cs417.dgt.adapter;

import edu.ccsu.cs417.dgt.logger.BasicLog;
import edu.ccsu.cs417.dgt.logger.WidgetLogDecorator;
import edu.ccsu.cs417.dgt.logger.LoggingService;
import edu.ccsu.cs417.dgt.strategy.UserNotification;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Arm class implements Activate interface in adapter pattern to activate 
 * ultrasonic sensor system.
 * @author Tom
 */
public class Arm implements Activate {
    
    /**
     * Method activate() collects system type information to create an appropriate runtime
     * environment which invokes a Python script. Feedback from the script is passed 
     * back to the method.
     * @param notifier used to notify the user when sensor is triggered
     * @throws IOException
     * @return String representing sensor that triggered script return
     * @throws InterruptedException
     */
    @Override
    public String activate(UserNotification notifier) throws InterruptedException, IOException {
        String widget = "";
        
        while (!widget.equals("button")) { 
            
            // Set up the command and parameter for location of the range file
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
                cmd[1] = dir.toString() + "\\python_scripts\\range_sensor.py";
            } else {
                // For Linux based systems
                cmd[0] = "python";
                cmd[1] = dir.toString() + "/python_scripts/range_sensor.py";
            }  
            
            // Create runtime to execute external command
            Runtime rt = Runtime.getRuntime();
            Process pr = rt.exec(cmd);

            // Retrieve output from python script
            BufferedReader bfr = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            String line = "";

            String action = "";
            int counter = 0;
            int time = 0;
            int date = 0;

            LoggingService ls = LoggingService.getInstance();

            while((line = bfr.readLine()) != null) {
                // Recieve information from python script
                switch (counter) {
                    case 0: {
                        date = Integer.parseInt(line);
                        break;
                    }
                    case 1: {
                        time = Integer.parseInt(line);
                        break;
                    }
                    case 2: {
                        widget = line;
                        break;
                    }
                    default: {
                        System.out.println();
                        break;   
                    }
                }
                counter++;
            }

            BasicLog b = new BasicLog(date, time);
            WidgetLogDecorator wg = new WidgetLogDecorator(widget, b);

            if (widget.equals("sensor")) {
                action = "Sensor tripped";
                notifier.notifyUser();
            } else if (widget.equals("button")) {
                action = "Deactivated by button";
            }

            wg.setMessage(action);
            ls.addLog(b);
        }
        return widget;
    }
}
