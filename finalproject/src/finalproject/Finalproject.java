package finalproject;

import edu.ccsu.cs417.group2.finalproject.adapter.Arm;
import edu.ccsu.cs417.group2.finalproject.adapter.ArmAdapter;
import edu.ccsu.cs417.group2.finalproject.builder.JsonLogBuilder;
import edu.ccsu.cs417.group2.finalproject.builder.LogBuilder;
import edu.ccsu.cs417.group2.finalproject.builder.LogReader;
import edu.ccsu.cs417.group2.finalproject.logger.BasicLog;
import edu.ccsu.cs417.group2.finalproject.logger.LogCollection;
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
        BasicLog c = new BasicLog(2112016,164902);
        LogDecorator d = new WidgetLogDecorator("Motion Sensor", c);
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
        
        // Test LED code
        Arm arm = new Arm();
        ArmAdapter adapter = new ArmAdapter();
        
        // Activates LED by calling Python file
        arm.activate();
        System.out.println("Activated system");
        
    }
}
