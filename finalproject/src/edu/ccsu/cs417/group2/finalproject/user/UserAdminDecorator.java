package edu.ccsu.cs417.group2.finalproject.user;

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
        // TODO be implemented
    }
}
