package edu.ccsu.cs417.dgt.user;

/**
 * Abstract class used to decorate User classes with different privileges
 * 
 * @author Cameron
 */
public abstract class UserDecorator implements UserInterface {

	protected String status;
	protected final UserInterface decoratedUser;
	protected UserComposite parent;

	/**
	 * Abstract constructor, creates an object that must extend AbstractUser
	 * 
	 * @param decoratedUser
	 *            the abstract object of the class
	 */
	public UserDecorator(UserInterface decoratedUser) {
		this.decoratedUser = decoratedUser;
	}

	/**
	 * Makes a call to the AbstractUser class to get user name
	 * 
	 * @return the name variable from class
	 */
	@Override
	public String getName() {
		return decoratedUser.getName();
	}

	/**
	 * Makes a call to the AbstractUser class to set the name variable
	 * 
	 * @param name
	 *            name to be set to the name variable
	 */
	@Override
	public void setName(String name) {
		decoratedUser.setName(name);
	}

	/**
	 * Get the status of the decorated user; how the class is decorated.
	 * 
	 * @return String of the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of the decorated user; how the class is decorated.
	 * 
	 * @param status
	 *            the description of the decorated class
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Getter for decoratedUser
	 * 
	 * @return an implementation of the UserInterface of a user
	 */
	public UserInterface getDecoratedUser() {
		return this.decoratedUser;
	}

	/**
	 * Getter for parent variable.
	 * 
	 * @return UserComposite object in the parent variable.
	 */
	@Override
	public UserComposite getComposite() {
		return parent;
	}

	/**
	 * Sets the composite for user interface
	 * 
	 * @param composite
	 *            UserComposite to become the parent variable
	 */
	@Override
	public void setComposite(UserComposite composite) {
		this.parent = composite;
	}

	/**
	 * Makes a call to the AbstractUser class to get string all the public user
	 * information, then adds the status of the decorated object
	 * 
	 * @return String representation of the user
	 */
	@Override
	public String toString() {
		String s = decoratedUser.toString();
		s += " " + status;
		return s;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((decoratedUser == null) ? 0 : decoratedUser.hashCode());
		result = prime * result + ((parent == null) ? 0 : parent.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
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
		UserDecorator other = (UserDecorator) obj;
		if (decoratedUser == null) {
			if (other.decoratedUser != null) {
				return false;
			}
		} else if (!decoratedUser.equals(other.decoratedUser)) {
			return false;
		}
		if (parent == null) {
			if (other.parent != null) {
				return false;
			}
		} else if (!parent.equals(other.parent)) {
			return false;
		}
		if (status == null) {
			if (other.status != null) {
				return false;
			}
		} else if (!status.equals(other.status)) {
			return false;
		}
		return true;
	}
}
