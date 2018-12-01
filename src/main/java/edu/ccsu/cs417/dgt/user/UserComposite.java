package edu.ccsu.cs417.dgt.user;

import edu.ccsu.cs417.dgt.factory.AbstractLogFactory;
import edu.ccsu.cs417.dgt.factory.UserLogDecoratorFactory;
import edu.ccsu.cs417.dgt.logger.LoggingService;
import java.util.Iterator;
import java.util.List;

/**
 * Composite class of users
 *
 * @author Cameron
 */
public abstract class UserComposite implements UserInterface {

	private static final AbstractLogFactory LOG_FACTORY = new UserLogDecoratorFactory();

	protected String name;
	protected List<UserInterface> userList;
	protected UserComposite parent;

	/**
	 * Used to get the name of the composite.
	 *
	 * @return String of the composite.
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * Used to set the name of the composite.
	 *
	 * @param name
	 *            name of the composite
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Adds a new user or composite to the composites list
	 *
	 * @param user
	 *            the object to be added to the list
	 */
	public void addUser(UserInterface user) {
		this.userList.add(user);
		user.setComposite(this);
		LoggingService.getInstance().addLog(LOG_FACTORY.createLog(user.getName(), "user-login"));
	}

	/**
	 * Removes a user/composite from the composites list
	 *
	 * @param user
	 *            the object to be removed from the list
	 * @return user that was removed from the list
	 */
	public UserInterface removeUser(UserInterface user) {
		UserInterface r = null;
		if (this.userList.remove(user) == true) {
			r = user;
		}
		return r;
	}

	/**
	 * Removes a user/composite from the composites list
	 *
	 * @param name
	 *            the name of the user to be removed from the list
	 * @return user that was removed from the list
	 */
	public UserInterface removeUser(String name) {
		UserInterface r = null;
		UserInterface check = null;
		boolean found = false;
		while (userList.iterator().hasNext() && !found) {
			check = userList.iterator().next();
			if (check.getName().equalsIgnoreCase(name)) {
				found = true;
			}
		}
		if (found) {
			if (this.userList.remove(check) == true) {
				r = check;
			}
		}
		return r;
	}

	/**
	 * Gets object to cycle through list of users/composites
	 *
	 * @return userList's iterator
	 */
	public Iterator<UserInterface> iterator() {
		return userList.iterator();
	}

	/**
	 * Gets the composite associated with the user
	 *
	 * @return parent, or self if parent is null
	 */
	@Override
	public UserComposite getComposite() {
		if (parent == null) {
			return this;
		}
		return parent;
	}

	/**
	 * Sets the composite for user interface
	 *
	 * @param c
	 *            composite to become the parent variable
	 */
	@Override
	public void setComposite(UserComposite c) {
		this.parent = c;
	}

	@Override
	public String toString() {
		Iterator<UserInterface> itr = this.iterator();
		StringBuilder list = new StringBuilder();
		list.append("[");
		while (itr.hasNext()) {
			list.append(itr.next().toString());
			if (itr.hasNext()) {
				list.append(",");
			}
		}
		list.append("]");
		return "UserComposite [name=" + name + ", userList=" + list.toString() + ", parent=" + parent + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((parent == null) ? 0 : parent.hashCode());
		result = prime * result + ((userList == null) ? 0 : userList.hashCode());
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
		UserComposite other = (UserComposite) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (parent == null) {
			if (other.parent != null) {
				return false;
			}
		} else if (!parent.equals(other.parent)) {
			return false;
		}
		if (userList == null) {
			if (other.userList != null) {
				return false;
			}
		} else if (!userList.equals(other.userList)) {
			return false;
		}
		return true;
	}
}
