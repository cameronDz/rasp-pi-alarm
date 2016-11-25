package edu.ccsu.cs417.group2.finalproject.builder;

/**
 * Converts a Log to String representation of JSON object
 * @author Cameron
 */
public class JsonLogBuilder implements LogBuilder {
    
    private String json;

    /**
     * Converts integer variable to JSON representation String
     * @param time integer to be converted to a String
     */
    @Override
    public void buildTime(int time) {
        String s = "\"time\":\"" + time + "\"";
        nullTest(s);
    }

    /**
     * Converts integer variable to JSON representation String
     * @param date integer to be converted to a String
     */
    @Override
    public void buildDate(int date) {
        String s = "\"date\":\"" + date + "\"";
        nullTest(s);
    }
    
    /**
     * Converts String variable to JSON representation String
     * @param message String to be converted to a String
     */
    @Override
    public void buildMessage(String message) {
        String s = "\"messsage\":\"" + message + "\"";
        nullTest(s);
    }
    
    /**
     * Gets the current JSON string, closes it, and returns it
     * @return JSON representation of the Log that was built
     */
    public String getJsonLog() {
        String j = this.json;
        j += "}";
        return j;
    }
    
    /**
     * Test for start of JSON String, creates brackets if new String
     * @param s String to be added to the JSON String
     */
    private void nullTest(String s) {
        if(json == null) {
            json = "{" + s;
        } else {
            json += s;
        }
    }
}
