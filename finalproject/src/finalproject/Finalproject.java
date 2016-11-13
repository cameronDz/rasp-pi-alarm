package finalproject;

import edu.ccsu.cs417.finalproject.logger.Arm;
import edu.ccsu.cs417.finalproject.logger.ArmAdapter;
import edu.ccsu.cs417.finalproject.logger.Log;
import edu.ccsu.cs417.finalproject.logger.LoggingService;
import java.io.IOException;

public class Finalproject {

    /**
     * @param args the command line arguments
     * @throws InterruptedException
     * @throws IOException
     */
    public static void main(String[] args) throws InterruptedException, IOException {
        
        // testing Log, LoggingService, LogCollection, and LogIterator
        Log a = new Log(2112016,164600);
        Log b = new Log(2112016,164700,"Has a message.");
        Log c = new Log(2112016,164902);
        
        LoggingService.getInstance().addLog(a);
        LoggingService.getInstance().addLog(b);
        LoggingService.getInstance().addLog(c);
        
        String s = LoggingService.getInstance().getLogs();
        System.out.println(s);
        
        Arm arm = new Arm();
        ArmAdapter adapter = new ArmAdapter();
        
        // Activates LED by calling Python file
        arm.activate();
        System.out.println("Activated LED");
        
        // Pause 10 seconds before deactivating
        Thread.sleep(10000);
        
        // Deactivates LED with adapter class which calls Python file
        adapter.activate();
        System.out.println("Deactivated LED");
    }
    
}
