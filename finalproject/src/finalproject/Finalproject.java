package finalproject;

import edu.ccsu.cs417.group2.finalproject.builder.JsonLogBuilder;
import edu.ccsu.cs417.group2.finalproject.builder.LogReader;
import java.util.Scanner;

import edu.ccsu.cs417.group2.finalproject.factory.AbstractLogFactory;
import edu.ccsu.cs417.group2.finalproject.factory.UserLogDecoratorFactory;
import edu.ccsu.cs417.group2.finalproject.logger.BasicLog;
import edu.ccsu.cs417.group2.finalproject.logger.LogCollection;
import edu.ccsu.cs417.group2.finalproject.logger.LogInterface;
import edu.ccsu.cs417.group2.finalproject.logger.LoggingService;
import edu.ccsu.cs417.group2.finalproject.strategy.UserNotification;
import edu.ccsu.cs417.group2.finalproject.strategy.BuzzerStrategy;
import edu.ccsu.cs417.group2.finalproject.strategy.SilentStrategy;
import edu.ccsu.cs417.group2.finalproject.state.SecuritySystem;
import edu.ccsu.cs417.group2.finalproject.strategy.LightStrategy;
import edu.ccsu.cs417.group2.finalproject.user.BasicUser;
import edu.ccsu.cs417.group2.finalproject.user.UserAdminDecorator;
import edu.ccsu.cs417.group2.finalproject.user.UserComposite;
import edu.ccsu.cs417.group2.finalproject.user.UserInterface;
import edu.ccsu.cs417.group2.finalproject.user.UserListComposite;
import edu.ccsu.cs417.group2.finalproject.user.UserModDecorator;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;

public class Finalproject {
    
    private final static Date date = new Date();
    
    /**
     * @param args the command line arguments
     * @throws InterruptedException
     * @throws IOException
     */
    public static void main(String[] args) throws InterruptedException, IOException {
        
        // set up strategy
        UserNotification notifier = new UserNotification(new SilentStrategy());
        
        //Create json builder
        JsonLogBuilder builder = new JsonLogBuilder();
        LogReader reader = new LogReader(builder);
        
        // Create new security system object and run
        SecuritySystem system = new SecuritySystem();
            
        Scanner scan = new Scanner(System.in);
        String input;
        
        // make compostire
        UserComposite userList = new UserListComposite("basic");
        UserComposite userListSpecial = new UserListComposite("priveledged");
        
        //loggin user in
        System.out.print("Enter user name: ");
        input= scan.nextLine();
        
        UserInterface user;
        
        if(input.equalsIgnoreCase("admin")) {
            user = new UserAdminDecorator(new BasicUser(input));
            userListSpecial.addUser(user);
        }
        else if(input.equalsIgnoreCase("mod")) {
            user = new UserModDecorator(new BasicUser(input));
            userListSpecial.addUser(user);
        }
        else {
            user = new BasicUser(input);
            userList.addUser(user);
        }
        
        // log factory
        AbstractLogFactory logFact = new UserLogDecoratorFactory();
        LoggingService.getInstance().addLog(logFact.createLog(user.getName(), "user-login"));
        
        
        boolean loop = true;
        
        while (loop) {
            
            // Run system for first time
//            system.arm(notifier);
            
            if(user instanceof UserAdminDecorator)
                System.out.println("Enter input: (1) print logs, (2) set strategy, (3) restart system, or (4) change user, (5) exit, (dl) delete logs");
            else if(user instanceof UserModDecorator)
                System.out.println("Enter input: (1) print logs, (2) set strategy, (3) restart system, or (4) change user, (5) exit, (du) delete user");
            else
                System.out.println("Enter input: (1) print logs, (2) set strategy, (3) restart system, or (4) change user, (5) exit");
            
            input = scan.next();
            
            switch (input) {
                case "1": {
                    // Print logs
                    System.out.println("Enter input: (1) print String logs, (2) print Json logs");
                    input = scan.next();
                    if(input.equals("1")) {
                        System.out.println(LoggingService.getInstance().toString());
                    }
                    else {
                        LogCollection logs = LoggingService.getInstance().getLogs();
                        Iterator<LogInterface> logIterator = logs.iterator();
                        System.out.println("[");
                        while(logIterator.hasNext()) {
                            reader.parseLog(logIterator.next());
                            System.out.print(builder.getJsonLog());
                            if(logIterator.hasNext())
                                System.out.println(",");
                            else
                                System.out.println();
                        }
                        System.out.println("]");
                    }
                    break;
                }   
                case "2": {
                    // Set strategy
                    System.out.println("Enter input: (1) buzzer strategy, (2) silent strategy, (3) light strategy");
                    input = scan.next();
                    
                    GregorianCalendar x = new GregorianCalendar();
                    int date = (x.get(GregorianCalendar.DAY_OF_MONTH)) + 
                            (x.get(GregorianCalendar.MONTH) + 1) *100 +
                            x.get(GregorianCalendar.YEAR) *10000;
                    int time = (int) new Date().getTime() * -1;
                    
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
                    //user logout
                    System.out.print("Enter user name: ");
                    input = scan.next();
        
                    // log factory
                    logFact = new UserLogDecoratorFactory();
                    
                    if(input.equalsIgnoreCase("admin")) {
                        user = new UserAdminDecorator(new BasicUser(input));
                        userListSpecial.addUser(user);
                    }
                    else if(input.equalsIgnoreCase("mod")) {
                        user = new UserModDecorator(new BasicUser(input));
                        userListSpecial.addUser(user);
                    }
                    else {
                        user = new BasicUser(input);
                        userList.addUser(user);
                    }
                    LoggingService.getInstance().addLog(logFact.createLog(user.getName(), "user-login"));
                    break;
                }
                case "dl": {
                    if(user instanceof UserAdminDecorator) {
                        ((UserAdminDecorator) user).deleteLog(0);
                    }
                    else {
                        System.out.println("ERROR: Invalid user priviledges");
                    }
                    break;
                }
                case "du": {
                    //Ummm nothing's here...
                    break;
                }
                default:
                    // Exit loop
                    loop = false;   
                    break;
            }
        } 
    }
}
