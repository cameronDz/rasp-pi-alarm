package edu.ccsu.cs417.dgt.user;

import java.util.ArrayList;

/**
 * Extends UserComposite to create a User List object. Since this is just an 
 * instance-able version of UserComposite, there is not hashCode, equals, or 
 * toString functions overridden.
 * @author Cameron
 */
public class UserListComposite extends UserComposite {
    
    public UserListComposite(String name) {
        this.name = name;
        this.userList = new ArrayList<>();
    }
        
}
