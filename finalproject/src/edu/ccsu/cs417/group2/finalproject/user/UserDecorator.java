package edu.ccsu.cs417.group2.finalproject.user;

/**
 * Abstract class used to decorate User classes with different privileges 
 * @author Cameron
 */
public abstract class UserDecorator extends AbstractUser {
    
    protected String status;
    protected final AbstractUser decoratedUser;
    
    /**
     * Abstract constructor, creates an object that must extend AbstractUser
     * @param decoratedUser the abstract object of the class
     */
    public UserDecorator(AbstractUser decoratedUser) {
        this.decoratedUser = decoratedUser;
    }
    
    /**
     * Makes a call to the AbstractUser class to get user name
     * @return the name variable from class
     */
    @Override
    public String getName() {
        return decoratedUser.getName();
    }
    
    /**
     * Makes a call to the AbstractUser class to set the name variable
     * @param name name to be set to the name variable
     */
    @Override
    public void setName(String name) {
        decoratedUser.setName(name);
    }
        
    /**
     * Get the status of the decorated user; how the class is decorated.
     * @return String of the status
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * Set the status of the decorated user; how the class is decorated.
     * @param status the description of the decorated class
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * Makes a call to the AbstractUser class to get string all the public user
 information, then adds the status of the decorated object
     * @return String representation of the user
     */
    @Override 
    public String toString() {
        String s = decoratedUser.toString();
        s += " " + status;
        return s;
    }
}
