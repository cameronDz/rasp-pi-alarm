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
	 *            UserInterface object being wrapped as a UserAdmin.
	 */
	public UserAdminDecorator(UserInterface decoratedUser) {
		super(decoratedUser);
		this.status = "Administrator";
	}

	/**
	 * Removes all logs from Singleton.
	 * 
	 * @return Integer number of logs removed.
	 */
	public Integer deleteLog() {
		return LoggingService.getInstance().deleteLog();
	}

	/**
	 * Removes the parameter value of logs from Singleton. Will return the number of
	 * logs removed from application Singleton storing logs.
	 * 
	 * @param number
	 *            Integer value of Log number being removed.
	 */
	public Integer deleteLog(Integer number) {
		Integer ret = 0;
		if (number != null && number > 0) {
			LoggingService.getInstance().deleteLog();
		}
		return ret;
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
