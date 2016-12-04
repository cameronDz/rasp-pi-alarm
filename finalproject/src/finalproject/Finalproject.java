package finalproject;

import edu.ccsu.cs417.group2.finalproject.adapter.Arm;
import edu.ccsu.cs417.group2.finalproject.adapter.ArmAdapter;
import edu.ccsu.cs417.group2.finalproject.adapter.ArmAdapterLED;
import edu.ccsu.cs417.group2.finalproject.adapter.ArmLED;
import edu.ccsu.cs417.group2.finalproject.builder.JsonLogBuilder;
import edu.ccsu.cs417.group2.finalproject.builder.LogBuilder;
import edu.ccsu.cs417.group2.finalproject.strategy.UserNotification;
import edu.ccsu.cs417.group2.finalproject.strategy.UserNotificationStrategy;
import edu.ccsu.cs417.group2.finalproject.strategy.BuzzerStrategy;
import edu.ccsu.cs417.group2.finalproject.strategy.SilentStrategy;
import edu.ccsu.cs417.group2.finalproject.builder.LogReader;
import edu.ccsu.cs417.group2.finalproject.logger.BasicLog;
import edu.ccsu.cs417.group2.finalproject.logger.LogCollection;
import edu.ccsu.cs417.group2.finalproject.logger.LogDecorator;
import edu.ccsu.cs417.group2.finalproject.logger.LoggingService;

import edu.ccsu.cs417.group2.finalproject.state.SecuritySystem;


import edu.ccsu.cs417.group2.finalproject.logger.LogDecoratorFactory;
import edu.ccsu.cs417.group2.finalproject.logger.WidgetLogDecoratorFactory;

import edu.ccsu.cs417.group2.finalproject.state.SecuritySystem;
import java.io.FileInputStream;
import java.util.Properties;
import java.io.IOException;

public class Finalproject {

    /**
     * @param args the command line arguments
     * @throws InterruptedException
     * @throws IOException
     */
    public static void main(String[] args) throws InterruptedException, IOException {
        
        FileInputStream environmentProperties;
        
        try {
            environmentProperties = new FileInputStream("config/environment.properties");
            Properties props = new Properties();
            props.load(environmentProperties);
            
            if(props.containsKey(GREEN_LED_PORT)) {
                // Component greenLed = new Led(props.getProperty(GREEN_LED_PORT));
                System.out.println("Set green led");
            }
            if(props.containsKey(RED_LED_PORT)) {
                // Component redLed = new Led(props.getProperty(RED_LED_PORT));
                System.out.println("Set red led");
            }
            if(props.containsKey(BUZZER_PORT)) {
                // Component buzzer = new Buzzer(props.getProperty(BUZZER_PORT));
                System.out.println("Set buzzer");
            }
            if(props.containsKey(RANGER_PORT)) {
                // Component ranger = new Ranger(props.getProperty(RANGER_PORT));
                System.out.println("Set ranger");
            }
            if(props.containsKey(BUTTON_PORT)) {
                // Component button = new Button(props.getProperty(BUTTON_PORT));
                System.out.println("Set button");
            }
            
        } catch (Exception ex) {
          ex.printStackTrace();
        }
        
        // testing Log, LoggingService, LogCollection, and LogIterator
        BasicLog a = new BasicLog(2112016,164600);
        BasicLog b = new BasicLog(2112016,164700,"Has a message.");
        BasicLog c = new BasicLog(2112016,164902);
        LogDecorator d = LogDecoratorFactory.getLogDecorator(new WidgetLogDecoratorFactory("Motion Sensor", c));
        d.setAction("Sense Movement");
        
        // put logs into logging service collection
        LoggingService.getInstance().addLog(a);
        LoggingService.getInstance().addLog(b);
        LoggingService.getInstance().addLog(c);
        
        // print currect log list
        String x = LoggingService.getInstance().toString();        
        System.out.println("***Logging Service test***");
        System.out.println(x);
        
        // test builder package
        JsonLogBuilder lb = new JsonLogBuilder();
        LogReader lr = new LogReader(lb);
        lr.parseLog(a);
        String json = lb.getJsonLog();
        System.out.println("***Json test***");
        System.out.println(json);
        System.out.println();
        
        // test strategy package
        UserNotification notifier = new UserNotification(new SilentStrategy());
        notifier.notifyUser();
        notifier.changeStrategy(new BuzzerStrategy());
        notifier.notifyUser();
        
        // Create new security system object and run
        SecuritySystem system = new SecuritySystem();
        
        // Sgin in user
        // if admin/mod
            // create user
            
            
        // while loop 
            // print, save, arm
        
        
        system.arm();
        
        
        system.disarm();
        
        
        
        // end loop
        
        
        // Test activation of LED through adapter pattern
        ArmLED armLED = new ArmLED();
        ArmAdapterLED adapterLED = new ArmAdapterLED();
        armLED.activate();
             // Pause 10 seconds before deactivating
        Thread.sleep(10000);
        adapterLED.activate();

        // Test activation of system through adapter pattern
        Arm arm = new Arm();
        ArmAdapter adapter = new ArmAdapter();
        arm.activate();
        adapter.activate();
        
    }
    
    private final static String GREEN_LED_PORT = "GREEN_LED_PORT";
    private final static String RED_LED_PORT   = "RED_LED_PORT";
    private final static String BUZZER_PORT    = "BUZZER_PORT";
    private final static String RANGER_PORT    = "RANGER_PORT";
    private final static String BUTTON_PORT    = "BUTTON_PORT";
}
