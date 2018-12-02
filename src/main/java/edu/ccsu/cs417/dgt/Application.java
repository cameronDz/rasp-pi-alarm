package edu.ccsu.cs417.dgt;

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
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {

    private static final String ENTER_SELECTION = "Enter selection: ";
    private static final String INVALID_OPTION = "ERROR: Invalid option, try again.\n";
    private static final String DEFAULT_OPTIONS
            = "Enter system option:\n"
            + "(1) Print all logs\n"
            + "(2) Set alarm strategy\n"
            + "(3) Activate alarm system\n"
            + "(4) Change user name\n"
            + "(5) Quit and Exit application\n";
    private static final String STRATEGY_OPTIONS
            = "Select Alarm Strategy Option:\n"
            + "(1) Buzzer: alarm tripped deactivates system and buzzer is set off.\n"
            + "(2) Silent: alarm is tripped logs incident, alarm stays active.\n"
            + "(3) Light: alarm tripped deactivates system and red light is turned on.\n"
            + ENTER_SELECTION;
    private static final String LOG_OPTIONS
            = "Select log format:\n"
            + "(1) Print Text logs.\n"
            + "(2) Print JSON logs.\n"
            + ENTER_SELECTION;
    private static final List<String> DEFAULT_OPTIONS_LIST = Arrays.asList(
            new String[]{"1", "2", "3", "4", "5", "DL", "DI"});

    private static final UserComposite USER_LIST = new UserListComposite("basic");
    private static final UserComposite PRIVILEDGED_USER_LIST = new UserListComposite("priveledged");

    private static UserInterface user;
    private static Scanner scan;
    private static String input;

    /**
     * @param args String array the command line arguments
     */
    public static void main(String... args) {

        // Create new security system and notifier strategy
        UserNotification notifier = new UserNotification(new SilentStrategy());
        SecuritySystem system = new SecuritySystem();

        // Create user input objects
        scan = new Scanner(System.in);
        input = logUserAccessIntoSystem();

        boolean loop = true;
        while (loop) {
            
            System.out.println("System being disarmed.");
            system.disarm();
            String inputMessage;
            if (user instanceof UserAdminDecorator) {
                inputMessage = DEFAULT_OPTIONS + "(DL) Delete Logs\n";
            } else if (user instanceof UserModDecorator) {
                inputMessage = DEFAULT_OPTIONS + "(DU) Delete User\n";
            }
            input = "";
            while (!DEFAULT_OPTIONS_LIST.contains(input)) {
                inputMessage = DEFAULT_OPTIONS + ENTER_SELECTION;
                System.out.print(inputMessage);
                input = scan.next().toUpperCase();
            }
            switch (input.toLowerCase()) {
                case "1": {
                    // Print logs
                    input = "";
                    while (!"1".equals(input) && !"2".equals(input)) {
                        System.out.print(LOG_OPTIONS);
                        input = scan.next();
                        if ("1".equals(input)) {
                            System.out.println(LoggingService.getInstance().toString());
                        } else if ("2".equals(input)) {
                            System.out.println(LoggingService.getInstance().toJson());
                        } else { 
                            System.out.println(INVALID_OPTION); 
                        }
                    }
                    break;
                }
                case "2": {
                    // Set strategy
                    input = "";
                    while (!"1".equals(input) && !"2".equals(input) && !"3".equals(input)) {
                        System.out.print(STRATEGY_OPTIONS);
                        input = scan.next();
                        switch (input) {
                            case "1": {
                                notifier.changeStrategy(new BuzzerStrategy());
                                break;
                            }
                            case "2": {
                                notifier.changeStrategy(new SilentStrategy());
                                break;
                            }
                            case "3": {
                                notifier.changeStrategy(new LightStrategy());
                                break;
                            }
                            default: {
                                System.out.println(INVALID_OPTION);
                                break;
                            }
                        }
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
                case "5": {
                    // exiting loop/application
                    loop = false;
                    break;
                }
                case "dl": {
                    if (user instanceof UserAdminDecorator) {
                        ((UserAdminDecorator) user).deleteLog();
                    } else {
                        System.out.println("ERROR: Invalid user priviledges");
                    }
                    break;
                }
                case "du": {
                    if (user instanceof UserModDecorator) {
                        System.out.print("Enter user name to delete: ");
                        input = scan.next();
                        ((UserModDecorator) user).deleteUser(user, input);
                    } else {
                        System.out.println("ERROR: Invalid user priviledges");
                    }
                    break;
                }
                default: {
                    System.out.println(INVALID_OPTION);
                    break;
                }
            }
            if(loop){
                try {
                    // Run system for first time
                    System.out.println(" ** System being armed. **");
                    system.arm(notifier);
                } catch (InterruptedException | IOException ex) {
                    String message = "System has encountered an issue: " + 
                            ex.getMessage() + "\nApplication shutting down.";
                    System.out.println(message);
                    System.exit(1);
                }
            }
        }
        scan.close();
        System.out.println("Application shutting down.");
        System.exit(0);
    }

    /**
     * Takes user input, adds input as new user name to appropriate list, logs
     * into system.
     *
     * @return String of the input provided by the user.
     */
    private static String logUserAccessIntoSystem() {
        System.out.print("Enter user name: ");
        input = scan.next();
        if (input.equalsIgnoreCase("admin")) {
            user = new UserAdminDecorator(new BasicUser(input));
            PRIVILEDGED_USER_LIST.addUser(user);
        } else if (input.equalsIgnoreCase("mod")) {
            user = new UserModDecorator(new BasicUser(input));
            PRIVILEDGED_USER_LIST.addUser(user);
        } else {
            user = new BasicUser(input);
            USER_LIST.addUser(user);
        }
        return input;
    }
}
