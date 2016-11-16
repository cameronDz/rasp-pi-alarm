package edu.ccsu.cs417.group2.finalproject.user;

/**
 * A basic user class with no added privileges. 
 * @author Cameron
 */
public class BasicUser extends AbstractUser {
    
    /**
     * Constructor for a basic user.
     * @param name name variable for the user created
     */
    public BasicUser(String name) {
        this.name = name;
    }
}
