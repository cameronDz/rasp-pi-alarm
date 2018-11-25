package edu.ccsu.cs417.dgt.user;

import edu.ccsu.cs417.dgt.logger.LoggingService;

/**
 * User Administrator is a decorated Abstract User that can delete Logs if they
 * have the corresponding log number.
 * @author Cameron 
 */
public class UserAdminDecorator extends UserDecorator {
    
    /**
     * Constructs the abstract object of the User, and sets the status of the 
     * decorated user. 
     * @param decoratedUser object being wrapped as a UserAdmin
     */
    public UserAdminDecorator(UserInterface decoratedUser) {
        super(decoratedUser);
        this.status = "Administrator";
    }
    
    /**
     * given a Log's number ID, removes that Log from records
     * @param i the number of the Log being removed
     */
    public void deleteLog(int i) {
        LoggingService.getInstance().deleteLog();
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
