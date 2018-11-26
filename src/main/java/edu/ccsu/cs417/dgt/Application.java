package edu.ccsu.cs417.dgt;

import edu.ccsu.cs417.dgt.factory.AbstractLogFactory;
import edu.ccsu.cs417.dgt.factory.UserLogDecoratorFactory;
import edu.ccsu.cs417.dgt.logger.BasicLog;
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
import java.util.Scanner;

public class Application {
    
    private static final String DEFAULT_INPUT_MESSAGE = "Enter input: (1) print logs, (2) set strategy, (3) restart system, or (4) change user, (5) exit";
    
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
        input = logUserAccessIntoSystem(scan);
        
        boolean loop = true;        
        while (loop) {            
            // Run system for first time
            system.arm(notifier);
            
            String inputMessage;
            if(user instanceof UserAdminDecorator) {
                inputMessage = DEFAULT_INPUT_MESSAGE + ", (dl) delete logs: ";
            } else if(user instanceof UserModDecorator) {
                inputMessage = DEFAULT_INPUT_MESSAGE + ", (du) delete user: ";
            } else {
                inputMessage = DEFAULT_INPUT_MESSAGE + ": ";
            }
            System.out.println(inputMessage); 
            input = scan.next();
            
            switch (input) {
                case "1": {
                    // Print logs
                    System.out.println("Enter input: (1) print String logs, (2) print Json logs");
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
                    System.out.println("Enter input: (1) buzzer strategy, (2) silent strategy, (3) light strategy");
                    input = scan.next();
                    
                    int date = getDateInteger(new Timestamp(System.currentTimeMillis()));
                    int time = getTimeInteger(new Timestamp(System.currentTimeMillis()));
                    
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
                    input = logUserAccessIntoSystem(scan);
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
     * Takes user input, adds input as new user name to appropriate list, logs into system
     * @param scan Scanner used to take user input
     * @return String of the input provided by the user.
     */
    private static String logUserAccessIntoSystem(Scanner scan) {        
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
        return input;
    }

    /**
     * Gets digits of current date in following format YYYYMMDD.
     * @param timestamp Timestamp being passed of current date
     * @return Integer of current date.
     */
    protected static int getDateInteger(Timestamp timestamp) { 
        String[] dates = timestamp.toString().split("-");
        int sum = Integer.valueOf(dates[0]) * 10000;
        sum += Integer.valueOf(dates[1]) * 100;
        sum += Integer.valueOf(dates[2].substring(0,2)) * 1;
        return sum;
    }

    /**
     * Gets digits of current time in following format hhmmss.
     * @param timestamp Timestamp being passed of current date
     * @return Integer of current time.
     */
    protected static int getTimeInteger(Timestamp timestamp) { 
        String[] times = timestamp.toString().split(" ")[1].split(":");
        int sum = Integer.valueOf(times[0]) * 10000;
        sum += Integer.valueOf(times[1]) * 100;
        sum += Integer.valueOf(times[2].substring(0,2)) * 1;
        return sum;
    }
}
