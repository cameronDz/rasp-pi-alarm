package edu.ccsu.cs417.group2.finalproject.user;

/**
 * Interface that all User classes is based off. 
 * @author Cameron
 */
public interface UserInterface {
    
    /**
     * Used to get the name/handle of a user. 
     * @return String of the name/handle of a user. 
     */
    public String getName();
    
    /**
     * Used to set the name/handle of a user. 
     * @param name name/handle to be set for the user
     */
    public void setName(String name);
    
    /**
     * Override of the standard Java toString method 
     * @return Should return a String of all publicly available user info
     */
    @Override
    public String toString();
    
    /**
     * Creates a hash code for the log 
     * @return int value of hash code
     */
    @Override
    public int hashCode();
    
    /**
     * Determines if two objects are equal
     * @param obj Object being compared to an instance of an implemented Log
     * @return boolean of whether logs are equal
     */
    @Override
    public boolean equals(Object obj);
}
