package edu.ccsu.cs417.dgt.user;

import java.util.ArrayList;

/**
 * Extends UserComposite to create a User List object. Since this is just an
 * instance-able version of UserComposite, there is not hashCode, equals, or
 * toString functions overridden.
 * 
 * @author Cameron
 */
public class UserListComposite extends UserComposite {

	/**
	 * 
	 * @param name
	 */
	public UserListComposite(String name) {
		this.name = name;
		this.userList = new ArrayList<>();
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
