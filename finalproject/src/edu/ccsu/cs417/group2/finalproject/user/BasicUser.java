package edu.ccsu.cs417.group2.finalproject.user;

/**
 * A basic user class with no added privileges. 
 * @author Cameron
 */
public class BasicUser implements UserInterface {
    
    protected String name;
    protected UserComposite parent;
    
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
     * Returns the parent of the user
     * @return The user composite associate with the user
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
     * Will return all publicly available user information
     * @return String representing user name
     */
    @Override
    public String toString() {
        String s = "";
        s += name;
        return s;
    }
    
    /**
     * Creates a hash code for the log 
     * @return int value of hash code
     */
    @Override
    public int hashCode() {
        int i = 0;
        
        i += this.name.hashCode();
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
        } else if( obj instanceof BasicUser) {
            BasicUser otherObj = (BasicUser) obj;
            if( otherObj.getName().equals(this.getName()) && 
                    otherObj.getComposite().equals(this.getComposite()) ){
                b = true;
            }
        }
        
        return b;
    }
}
