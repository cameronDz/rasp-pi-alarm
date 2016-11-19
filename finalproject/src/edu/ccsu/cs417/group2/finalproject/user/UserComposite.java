package edu.ccsu.cs417.group2.finalproject.user;

import java.util.Iterator;
import java.util.List;

/**
 * Composite class of users
 * @author Cameron
 */
public abstract class UserComposite implements UserInterface {
    
    protected String name;
    protected List<UserInterface> userList;
    
    /**
     * Used to get the name of a the composite. 
     * @return String of the composite. 
     */
    @Override
    public String getName() {
        return name;
    }
    
    /**
     * Used to set the name of the composite. 
     * @param name name of the composite
     */
    @Override
    public void setName(String name) {
        this.name = name; 
    }
    
    /**
     * Adds a new user or composite to the composites list
     * @param user the object to be added to the list
     */
    public void addUser(UserInterface user) {
        this.userList.add(user);
    }
    
    /**
     * Removes a user/composite from the composites list
     * @param user the object to be removed from the list
     */
    public void removeUser(UserInterface user) {
        this.userList.remove(user);
    }
    
    /**
     * Gets object to cycle through list of users/composites
     * @return userList's iterator
     */
    public Iterator<UserInterface> iterator() {
        return userList.iterator();
    }
    
    /**
     * Prints the composites name and then iterators through user list and
     * prints all user/composite information names.
     * @return String representation of the composite
     */
    @Override
    public String toString() {
        String s = name + ": \n";        
        Iterator itr = this.iterator();
        
        while(itr.hasNext()) {
            s += itr.next().toString() + "\n";
        }
        
        return s;
    }
    
    /**
     * Creates a hash code for the log 
     * @return int value of hash code
     */
    @Override
    public int hashCode() {
        int i = 0;
        i += name.hashCode();
        
        // cycle through collection and sum the hash values of all elements
        Iterator itr = this.iterator();        
        while(itr.hasNext()) {
            i += itr.next().hashCode();
        }
        
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
        } else if( obj instanceof UserComposite) {
            UserComposite otherObj = (UserComposite) obj;
            if( otherObj.getName().equals(this.getName()) ){
                // iterate through both collections, checking each element                
                Iterator otherItr = otherObj.iterator();
                Iterator thisItr = this.iterator();
                while(otherItr.hasNext()) {
                    if( !(otherItr.next().equals(thisItr.next())) )
                        return false;
                }
                
                // if object is iterated through entire collection and does not
                // fall any element equal tests, returns true
                b = true;
            }
        }
        
        return b;
    }
}
