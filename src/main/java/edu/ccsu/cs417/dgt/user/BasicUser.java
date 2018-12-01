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
	 * Empty constructor, sets variables to default values.
	 */
	public BasicUser() {
		super();
		this.name = "";
		this.parent = null;
	}

	/**
	 * Loaded constructor with String parameter for name variable.
	 * 
	 * @param name
	 *            String name variable for the user created.
	 */
	public BasicUser(String name) {
		super();
		this.name = name;
	}

	/**
	 * Loaded constructor with UserComposite parameter for parent variable.
	 * 
	 * @param parent
	 *            UserComposite to be set as parent variable.
	 */
	public BasicUser(UserComposite parent) {
		super();
		this.name = "";
		this.parent = parent;
	}

	/**
	 * Full constructor with all variables set through parameters.
	 * 
	 * @param name
	 *            String name variable for the user created.
	 * @param parent
	 *            UserComposite to be set as parent variable.
	 */
	public BasicUser(String name, UserComposite parent) {
		super();
		this.name = name;
		this.parent = parent;
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
	 * Setter for name variable.
	 * 
	 * @param name
	 *            String name/handle to be set for the user.
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter for parent variable.
	 * 
	 * @return UserComposite referenced by the parent variable.
	 */
	@Override
	public UserComposite getComposite() {
		return parent;
	}

	/**
	 * Setter for parent variable.
	 * 
	 * @param composite
	 *            UserComposite to become the parent variable.
	 */
	@Override
	public void setComposite(UserComposite composite) {
		this.parent = composite;
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
