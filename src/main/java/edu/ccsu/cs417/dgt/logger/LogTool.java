package edu.ccsu.cs417.dgt.logger;

import java.sql.Timestamp;

/**
 * Class used as a utility when creating logs.
 * @author Cameron
 */
public final class LogTool {
    
    /**
     * Hidden constructor for static tool class.
     */
    private LogTool() {
        // hidden constructor
    }
    
    /**
     * Gets digits of current date in following format YYYYMMDD.
     * @param timestamp Timestamp being passed of current date
     * @return Integer of current date.
     */
    public static int getDateInteger(Timestamp timestamp) { 
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
    public static int getTimeInteger(Timestamp timestamp) { 
        String[] times = timestamp.toString().split(" ")[1].split(":");
        int sum = Integer.valueOf(times[0]) * 10000;
        sum += Integer.valueOf(times[1]) * 100;
        sum += Integer.valueOf(times[2].substring(0,2)) * 1;
        return sum;
    }
}
