package edu.ccsu.cs417.dgt.user;

import java.util.ArrayList;
import java.util.List;

/**
 * Extends UserComposite to create a User List object. Since this is just an
 * instance-able version of UserComposite, there is not hashCode, equals, or
 * toString functions overridden.
 * 
 * @author Cameron
 */
public class UserListComposite extends UserComposite {

	/**
	 * Empty constructor sets variables to default values.
	 */
	public UserListComposite() {
		super();
		this.name = "";
		this.userList = new ArrayList<>();
	}

	/**
	 * Loaded constructor with String name paramter.
	 * 
	 * @param name
	 *            String value to be name variable.
	 */
	public UserListComposite(String name) {
		super();
		this.name = name;
		this.userList = new ArrayList<>();
	}

	/**
	 * Loaded constructor with List userList parameter.
	 * 
	 * @param userList
	 *            List of UserInterface implementations to be the userList variable.
	 */
	public UserListComposite(List<UserInterface> userList) {
		super();
		this.name = "";
		this.userList = userList;
	}

	/**
	 * Full constructor with all variables in parameter.
	 * 
	 * @param name
	 *            String value to be name variable.
	 * @param userList
	 *            List of UserInterface implementations to be the userList variable.
	 */
	public UserListComposite(String name, List<UserInterface> userList) {
		super();
		this.name = name;
		this.userList = userList;
	}

	@Override
	public String toString() {
		return "UserListComposite [" + super.toString() + "]";
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
		return super.equals((UserComposite) obj);
	}
}
