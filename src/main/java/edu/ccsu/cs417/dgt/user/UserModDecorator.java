package edu.ccsu.cs417.dgt.user;

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
    public UserModDecorator(UserInterface decoratedUser) {
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
    
    /**
     * Calls super of hashCode function.
     * @return int value of hash code
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    
    /**
     * Determines if two objects are equal
     * @param obj Object being compared to an instance of an implemented Log
     * @return boolean of whether logs are equal
     */
    @Override
    public boolean equals(Object obj) {
        boolean b = false;
        
        // makes sure object is not null
        if( obj == null ){
            return false;
        } 
        
        // logic checking all variables of two objects are equal
        if( this == obj ){
            return true;
        } else if( obj instanceof UserDecorator) {
            b = super.equals(obj);
        }
        
        return b;
    }
}
