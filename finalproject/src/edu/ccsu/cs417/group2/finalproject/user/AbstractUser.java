package edu.ccsu.cs417.group2.finalproject.user;

/**
 * Abstract class used as the basis for all user classes.
 * @author Cameron
 */
public abstract class AbstractUser implements UserInterface {
    
    protected String name;
    
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
