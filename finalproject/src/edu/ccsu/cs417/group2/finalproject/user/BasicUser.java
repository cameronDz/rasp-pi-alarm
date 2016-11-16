package edu.ccsu.cs417.group2.finalproject.user;

/**
 * A basic user class with no added privileges. 
 * @author Cameron
 */
public class BasicUser implements UserInterface {
    
    protected String name;
    
    /**
     * Constructor for a basic user.
     * @param name name variable for the user created
     */
    public BasicUser(String name) {
        this.name = name;
    }
        
    /**
     * Used to get the name/handle of a user. 
     * @return String of the name/handle of a user. 
     */
    @Override
    public String getName() {
        return name;
    }
    
    /**
     * Used to set the name/handle of a user. 
     * @param name name/handle to be set for the user
     */
    @Override
    public void setName(String name) {
        this.name = name; 
    }
    
    /**
     * Will return all publicly available user information
     * @return String representing 
     */
    @Override
    public String toString() {
        String s = "";
        s += name;
        return s;
    }
}
