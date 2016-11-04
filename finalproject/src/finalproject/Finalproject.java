package finalproject;

import edu.ccsu.cs417.finalproject.logger.Log;
import edu.ccsu.cs417.finalproject.logger.LoggingService;

/**
 *
 * @author Cameron
 */
public class Finalproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // testing Log, LoggingService, LogCollection, and LogIterator
        Log a = new Log(2112016,164600);
        Log b = new Log(2112016,164700,"Has a message.");
        Log c = new Log(2112016,164902);
        
        LoggingService.getInstance().addLog(a);
        LoggingService.getInstance().addLog(b);
        LoggingService.getInstance().addLog(c);
        
        String s = LoggingService.getInstance().getLogs();
        System.out.println(s);
    }
    
}
