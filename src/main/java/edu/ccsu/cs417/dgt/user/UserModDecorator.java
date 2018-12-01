package edu.ccsu.cs417.dgt.user;

import edu.ccsu.cs417.dgt.factory.AbstractLogFactory;
import edu.ccsu.cs417.dgt.factory.UserLogDecoratorFactory;
import edu.ccsu.cs417.dgt.logger.LoggingService;

/**
 * User Moderator is a decorated Abstract User that can delete users if they
 * have the User name
 *
 * @author Cameron
 */
public class UserModDecorator extends UserDecorator {

	private static final AbstractLogFactory LOG_FACTORY = new UserLogDecoratorFactory();

	/**
	 * Constructs the abstract object of the User, and sets the status of the
	 * decorated user.
	 *
	 * @param decoratedUser
	 *            object being wrapped as a User Moderator
	 */
	public UserModDecorator(UserInterface decoratedUser) {
		super(decoratedUser);
		this.status = "Moderator";
	}

	/**
	 * Deletes a user if they are given the correct user name.
	 *
	 * @param user
	 *            UserInterface user doing the log editing.
	 * @param name
	 *            String name of user to be deleted
	 */
	public void deleteUser(UserInterface user, String name) {
		// TODO be implemented
		LoggingService.getInstance().addLog(LOG_FACTORY.createLog(user.getName(), "user-deleted: " + name));
		LoggingService.getInstance().addLog(LOG_FACTORY.createLog(user.getName(), "unable to delete user: " + name));
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (getClass() != obj.getClass()) {
			return false;
		}
		return super.equals((UserDecorator) obj);
	}
}
