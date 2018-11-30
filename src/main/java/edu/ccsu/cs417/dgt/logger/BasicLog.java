package edu.ccsu.cs417.dgt.logger;

import java.sql.Timestamp;

/**
 * Class used as the bases for all widget logs. Can also be a stand alone log.
 * Currently no setters/getters since there does not seem to be any application
 * for them.
 *
 * @author Cameron
 */
public class BasicLog implements LogInterface {

    private int date;
    private int time;
    private String message;

    /**
     * Empty construct. Sets variables to default values.
     */
    public BasicLog() {
        date = 0;
        time = 0;
        message = "";
    }

    /**
     * Message only log. Sets time and date to current system time.
     * @param message String of messag for log.
     */
    public BasicLog(String message) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        this.date = LogTool.getDateInteger(timestamp);
        this.time = LogTool.getTimeInteger(timestamp);
        this.message = message;
    }

    /**
     * Constructor with no message; message variable set to "No Message."
     *
     * @param time Time the log occurred
     * @param date Date the log occurred
     */
    public BasicLog(int date, int time) {
        this.date = date;
        this.time = time;
        message = "No message.";
    }

    /**
     * Constructor with a message for the Log.
     *
     * @param date Date the log occurred
     * @param time Time the log occurred
     * @param message message for informing the log
     */
    public BasicLog(int date, int time, String message) {
        this.date = date;
        this.time = time;
        this.message = message;
    }

    /**
     * Sets the message of the Log to the String in parameter
     *
     * @param s String to be set to message variable
     */
    @Override
    public void setMessage(String s) {
        this.message = s;
    }

    /**
     * Getter for message variable
     *
     * @return String of log message
     */
    @Override
    public String getMessage() {
        return this.message;
    }

    /**
     * Getter for time variable
     *
     * @return int of time log occurred
     */
    @Override
    public int getTime() {
        return this.time;
    }

    /**
     *
     * @param time
     */
    public void setTime(int time) {
        this.time = time;
    }

    /**
     * Getter for date variable
     *
     * @return int of date log occurred
     */
    @Override
    public int getDate() {
        return this.date;
    }

    /**
     * 
     * @param date 
     */
    public void setDate(int date) {
        this.date = date;
    }

    /**
     * Print out that will be used to store log.
     *
     * @return String representing Date, Time, and message of the Log.
     */
    @Override
    public String toString() {
        String s = "";
        s += date + " ";
        s += time + " ";
        s += message;
        return s;
    }

    /**
     * Creates hash code value for the log
     *
     * @return integer of the hash code value
     */
    @Override
    public int hashCode() {
        int i = 0;
        i += date;
        i += time;
        i += message.hashCode();
        return i;
    }

    /**
     * Goes through all variables and checks that they are all equal
     *
     * @param obj Object being compared
     * @return boolean on whether obj is equal to an instance
     */
    @Override
    public boolean equals(Object obj) {
        boolean b = false;

        // makes sure object is not null
        if (obj == null) {
            return b;
        }

        // logic checking all variables of two objects are equal
        if (this == obj) {
            b = true;
        } else if (obj instanceof BasicLog) {
            BasicLog otherObj = (BasicLog) obj;
            if (otherObj.getDate() == this.getDate()
                    && otherObj.getTime() == this.getTime()
                    && otherObj.getMessage().equals(this.getMessage())) {
                b = true;
            }
        }
        return b;
    }
}
