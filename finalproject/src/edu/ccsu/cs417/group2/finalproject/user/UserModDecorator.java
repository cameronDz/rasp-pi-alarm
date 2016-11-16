package edu.ccsu.cs417.group2.finalproject.user;

/**
 * User Moderator is a decorated Abstract User that can delete users if they 
 * have the User name
 * @author Cameron
 */
public class UserModDecorator extends UserDecorator {
    
    /**
     * Constructs the abstract object of the User, and sets the status of the 
     * decorated user. 
     * @param decoratedUser object being wrapped as a User Moderator
     */
    public UserModDecorator(AbstractUser decoratedUser) {
        super(decoratedUser);
        this.status = "Moderator";
    }
    
    /**
     * Deletes a user if they are given the correct user name. 
     * @param name name of user to be deleted
     */
    public void deleteUser(String name) {
        // TODO be implemented 
    }
}
