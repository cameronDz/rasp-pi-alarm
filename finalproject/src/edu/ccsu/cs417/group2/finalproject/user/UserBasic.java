package edu.ccsu.cs417.group2.finalproject.user;

/**
 * A basic user class with no added privileges. 
 * @author Cameron
 */
public class UserBasic extends UserAbstract {
    
    /**
     * Constructor for a basic user.
     * @param name name variable for the user created
     */
    public UserBasic(String name) {
        this.name = name;
    }
}
