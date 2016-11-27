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
     * Returns just the json variable. Used for testing in equals method
     * @return json variable String
     */
    public String getJsonVariable() {
        if(json == null) {
            return "";
        }
        return json;
    }
    
    /**
     * Test for start of JSON String, creates brackets if new String
     * @param s String to be added to the JSON String
     */
    private void nullTest(String s) {
        if(json == null) {
            json = "{" + s;
        } else {
            json += " , " +s;
        }
    }
    
    /**
     * Returns current json String plus header
     * @return json variable String with header
     */
    @Override
    public String toString() {
        return "JsonLogBuilder:\n" + json;
    }
    
    /**
     * Creates hash code from single variable in object
     * @return Hash code of the current json variable
     */
    @Override
    public int hashCode() {
        if(json == null) {
            return 0;
        }
        return json.hashCode();
    }
    
    /**
     * Checks if an object is equal to Builder object
     * @param obj object being compared to instance
     * @return boolean on whether objects are equal
     */
    @Override
    public boolean equals(Object obj) {
        boolean b = false;
        
        // makes sure object is not null
        if( obj == null ){
            return b;
        } 
        
        // check if json variable present and equal in objects
        if( this == obj ){
            b = true;
        } else if( obj instanceof JsonLogBuilder) {
            JsonLogBuilder otherObj = (JsonLogBuilder) obj;
            
            if( otherObj.getJsonVariable().equals(json) ) {
                b = true;
            }
        }
        
        return b;
    }
}
