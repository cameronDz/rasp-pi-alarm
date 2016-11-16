package finalproject;

import edu.ccsu.cs417.group2.finalproject.adapter.Arm;
import edu.ccsu.cs417.group2.finalproject.adapter.ArmAdapter;
import edu.ccsu.cs417.group2.finalproject.logger.BasicLog;
import edu.ccsu.cs417.group2.finalproject.logger.AbstractLog;
import edu.ccsu.cs417.group2.finalproject.logger.LogDecorator;
import edu.ccsu.cs417.group2.finalproject.logger.WidgetLogDecorator;
import edu.ccsu.cs417.group2.finalproject.logger.LoggingService;
import java.io.IOException;

public class Finalproject {

    /**
     * @param args the command line arguments
     * @throws InterruptedException
     * @throws IOException
     */
    public static void main(String[] args) throws InterruptedException, IOException {
        
        // testing Log, LoggingService, LogCollection, and LogIterator
        BasicLog a = new BasicLog(2112016,164600);
        BasicLog b = new BasicLog(2112016,164700,"Has a message.");
        AbstractLog c = new BasicLog(2112016,164902);
        LogDecorator d = new WidgetLogDecorator("Motion Sensor", c);
        d.setAction("Sense Movement");
        
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
