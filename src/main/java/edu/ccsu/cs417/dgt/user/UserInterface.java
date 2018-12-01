package edu.ccsu.cs417.dgt.user;

/**
 * Interface that all User classes is based off.
 * 
 * @author Cameron
 */
public interface UserInterface {

	/**
	 * Used to get the name/handle of a user.
	 * 
	 * @return String of the name/handle of a user.
	 */
	public String getName();

	/**
	 * Used to set the name/handle of a user.
	 * 
	 * @param name
	 *            name/handle to be set for the user
	 */
	public void setName(String name);

	/**
	 * Get composite of the user
	 * 
	 * @return the composite associated with user
	 */
	public UserComposite getComposite();

	/**
	 * Sets the composite of the user
	 * 
	 * @param c
	 *            the composite to be associated with user
	 */
	public void setComposite(UserComposite c);
}
