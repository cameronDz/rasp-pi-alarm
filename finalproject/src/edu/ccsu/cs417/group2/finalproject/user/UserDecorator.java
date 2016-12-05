package edu.ccsu.cs417.group2.finalproject.user;

/**
 * Abstract class used to decorate User classes with different privileges 
 * @author Cameron
 */
public abstract class UserDecorator implements UserInterface {
    
    protected String status;
    protected final UserInterface decoratedUser;
    protected UserComposite parent;
    
    /**
     * Abstract constructor, creates an object that must extend AbstractUser
     * @param decoratedUser the abstract object of the class
     */
    public UserDecorator(UserInterface decoratedUser) {
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
     * Getter for decoratedUser
     * @return an implementation of the UserInterface of a user
     */
    public UserInterface getDecoratedUser() {
        return this.decoratedUser;
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public UserComposite getComposite() {
        return parent;
    }
    
    /**
     * Sets the composite for user interface
     * @param c composite to become the parent variable
     */
    @Override
    public void setComposite(UserComposite c) {
        this.parent = c;
    }
    
    /**
     * Makes a call to the AbstractUser class to get string all the public user
     * information, then adds the status of the decorated object
     * @return String representation of the user
     */
    @Override 
    public String toString() {
        String s = decoratedUser.toString();
        s += " " + status;
        return s;
    }
        
    /**
     * Creates a hash code for the log 
     * @return int value of hash code
     */
    @Override
    public int hashCode() {
        int i = 0;
        
        i += this.status.hashCode();
        i += this.decoratedUser.hashCode();
        i += this.parent.hashCode();
        
        return i;
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
            return b;
        } 
        
        // logic checking all variables of two objects are equal
        if( this == obj ){
            b = true;
        } else if( obj instanceof UserDecorator) {
            UserDecorator otherObj = (UserDecorator) obj;
            if( otherObj.getDecoratedUser().equals(this.getDecoratedUser()) &&
                    otherObj.getStatus().equals(this.getStatus()) &&
                    otherObj.getComposite().equals(this.getComposite()) ){
                b = true;
            }
        }
        
        return b;
    }
}
