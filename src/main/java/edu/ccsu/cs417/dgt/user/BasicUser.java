package edu.ccsu.cs417.dgt.user;

/**
 * A basic user class with no added privileges.
 * 
 * @author Cameron
 */
public class BasicUser implements UserInterface {

	protected String name;
	protected UserComposite parent;

	/**
	 * Constructor for a basic user.
	 * 
	 * @param name
	 *            name variable for the user created
	 */
	public BasicUser(String name) {
		this.name = name;
	}

	/**
	 * Used to get the name/handle of a user.
	 * 
	 * @return String of the name/handle of a user.
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * Used to set the name/handle of a user.
	 * 
	 * @param name
	 *            name/handle to be set for the user
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the parent of the user
	 * 
	 * @return The user composite associate with the user
	 */
	@Override
	public UserComposite getComposite() {
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
		return "BasicUser [name=" + name + ", parent=" + parent + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((parent == null) ? 0 : parent.hashCode());
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
		BasicUser other = (BasicUser) obj;
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
		return true;
	}
}
