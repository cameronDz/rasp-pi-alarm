package edu.ccsu.cs417.dgt;

import edu.ccsu.cs417.dgt.factory.AbstractLogFactory;
import edu.ccsu.cs417.dgt.factory.UserLogDecoratorFactory;
import edu.ccsu.cs417.dgt.logger.BasicLog;
import edu.ccsu.cs417.dgt.logger.LogTool;
import edu.ccsu.cs417.dgt.logger.LoggingService;
import edu.ccsu.cs417.dgt.strategy.UserNotification;
import edu.ccsu.cs417.dgt.strategy.BuzzerStrategy;
import edu.ccsu.cs417.dgt.strategy.SilentStrategy;
import edu.ccsu.cs417.dgt.state.SecuritySystem;
import edu.ccsu.cs417.dgt.strategy.LightStrategy;
import edu.ccsu.cs417.dgt.user.BasicUser;
import edu.ccsu.cs417.dgt.user.UserAdminDecorator;
import edu.ccsu.cs417.dgt.user.UserComposite;
import edu.ccsu.cs417.dgt.user.UserInterface;
import edu.ccsu.cs417.dgt.user.UserListComposite;
import edu.ccsu.cs417.dgt.user.UserModDecorator;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {
    
    private static final String DEFAULT_INPUT_MESSAGE = 
            "Enter system option:\n" +
            "(1) Print all logs\n" + 
            "(2) Set alarm strategy\n" + 
            "(3) Activate alarm system\n" +
            "(4) Change user name\n" +
            "(5) Quit and Exit application\n";
    private static final String STRATEGY_OPTIONS = 
            "Select Alarm Strategy Option:\n" +
            "(1) Buzzer: alarm tripped deactivates system and buzzer is set off.\n" +
            "(2) Silent: alarm is tripped logs incident, alarm stays active.\n" +
            "(3) Light: alarm tripped deactivates system and red light is turned on.\n" +
            "Enter selection: ";
    private static final String LOG_OPTIONS = 
            "Select log format:\n" + 
            "(1) Print Text logs.\n" +
            "(2) Print JSON logs.\n" +
            "Enter selection: ";
    private static final List<String> DEFAULT_OPTIONS_LIST = Arrays.asList(
            new String[] {"1", "2", "3", "4", "5", "DL", "DI"});
    
    private static final UserComposite USER_LIST = new UserListComposite("basic");
    private static final UserComposite PRIVILEDGED_USER_LIST = new UserListComposite("priveledged");
    private static final AbstractLogFactory LOG_FACTORY = new UserLogDecoratorFactory();
    
    private static UserInterface user;
    
    /**
     * @param args the command line arguments
     * @throws InterruptedException
     * @throws IOException
     */
    public static void main(String[] args) throws InterruptedException, IOException {
        
        // Create new security system and notifier strategy
        UserNotification notifier = new UserNotification(new SilentStrategy());        
        SecuritySystem system = new SecuritySystem();
        
        // Create user input objects
        Scanner scan = new Scanner(System.in);
        String input;
        
        //loggin user in
        input = logUserAccessIntoSystem();
        
        boolean loop = true;        
        while (loop) {            
            // Run system for first time
            system.arm(notifier);
            
            String inputMessage;
            if(user instanceof UserAdminDecorator) {
                inputMessage = DEFAULT_INPUT_MESSAGE + "(DL) Delete Logs\n";
            } else if(user instanceof UserModDecorator) {
                inputMessage = DEFAULT_INPUT_MESSAGE + "(DU) Delete User\n";
            }
            input = "";
            while(!DEFAULT_OPTIONS_LIST.contains(input)) {
                inputMessage = DEFAULT_INPUT_MESSAGE + "Ener selection: "; 
                System.out.println(inputMessage); 
                input = scan.next().toUpperCase();
            }
            switch (input.toLowerCase()) {
                case "1": {
                    // Print logs
                    System.out.println(LOG_OPTIONS);
                    input = scan.next();
                    if(input.equals("1")) {
                        System.out.println(LoggingService.getInstance().toString());
                    } else {
                        System.out.println(LoggingService.getInstance().toJson());
                    }
                    break;
                }   
                case "2": {
                    // Set strategy
                    System.out.println(STRATEGY_OPTIONS);
                    input = scan.next();
                    
                    int date = LogTool.getDateInteger(new Timestamp(System.currentTimeMillis()));
                    int time = LogTool.getTimeInteger(new Timestamp(System.currentTimeMillis()));
                    
                    if (input.equals("1")) {
                        notifier.changeStrategy(new BuzzerStrategy());
                        BasicLog buzzChange = new BasicLog(date,time,"STRATEGY CHANGED: BUZZER");
                        LoggingService.getInstance().addLog(buzzChange);
                    } else if(input.equals("2")) {
                        notifier.changeStrategy(new SilentStrategy());
                        BasicLog silentChange = new BasicLog(date,time,"STRATEGY CHANGED: SILENT");
                        LoggingService.getInstance().addLog(silentChange);
                    } else {
                        notifier.changeStrategy(new LightStrategy());
                        BasicLog lightChange = new BasicLog(date,time,"STRATEGY CHANGED: LIGHT");
                        LoggingService.getInstance().addLog(lightChange);
                    }
                    break;
                }
                case "3": {
                    // Restart system by repeating loop
                    break;
                }
                case "4": {
                    //user logout/in
                    input = logUserAccessIntoSystem();
                    break;
                }
                case "dl": {
                    if(user instanceof UserAdminDecorator) {
                        ((UserAdminDecorator) user).deleteLog(0);
                    } else {
                        System.out.println("ERROR: Invalid user priviledges");
                    }
                    break;
                }
                case "du": {                    
                    if(user instanceof UserModDecorator) {
                        System.out.println("Enter user name to delete: ");
                        input = scan.next();
                        ((UserModDecorator) user).deleteUser(input);
                        LoggingService.getInstance().addLog(LOG_FACTORY.createLog(user.getName(), "user-deleted: " + input));
                    } else {
                        System.out.println("ERROR: Invalid user priviledges");
                    }
                    break;
                }
                default: {
                    // Exit loop
                    loop = false;   
                    break;
                }
            }
        } 
    }

    /**
     * Takes user input, adds input as new user name to appropriate list, logs into system.
     * @return String of the input provided by the user.
     */
    private static String logUserAccessIntoSystem() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter user name: ");
        String input = scan.nextLine();
        if(input.equalsIgnoreCase("admin")) {
            user = new UserAdminDecorator(new BasicUser(input));
            PRIVILEDGED_USER_LIST.addUser(user);
        } else if(input.equalsIgnoreCase("mod")) {
            user = new UserModDecorator(new BasicUser(input));
            PRIVILEDGED_USER_LIST.addUser(user);
        } else {
            user = new BasicUser(input);
            USER_LIST.addUser(user);
        }
        LoggingService.getInstance().addLog(LOG_FACTORY.createLog(user.getName(), "user-login"));
        scan.close();
        return input;
    }
}
