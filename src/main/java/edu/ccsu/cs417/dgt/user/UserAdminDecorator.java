package edu.ccsu.cs417.dgt.user;

import edu.ccsu.cs417.dgt.logger.LoggingService;

/**
 * User Administrator is a decorated Abstract User that can delete Logs if they
 * have the corresponding log number.
 * 
 * @author Cameron
 */
public class UserAdminDecorator extends UserDecorator {

	/**
	 * Constructs the abstract object of the User, and sets the status of the
	 * decorated user.
	 * 
	 * @param decoratedUser
	 *            object being wrapped as a UserAdmin
	 */
	public UserAdminDecorator(UserInterface decoratedUser) {
		super(decoratedUser);
		this.status = "Administrator";
	}

	/**
	 * given a Log's number ID, removes that Log from records
	 * 
	 * @param i
	 *            the number of the Log being removed
	 */
	public void deleteLog(int i) {
		LoggingService.getInstance().deleteLog();
	}

	@Override
	public String toString() {
		return "UserAdminDecorator [" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (!super.equals(obj)) {
			return false;
		} else if (getClass() != obj.getClass()) {
			return false;
		}
		return super.equals((UserDecorator) obj);
	}
}
