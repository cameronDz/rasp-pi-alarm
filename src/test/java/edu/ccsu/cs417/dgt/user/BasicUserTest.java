package edu.ccsu.cs417.dgt.user;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author curti
 */
public class BasicUserTest {

	@Test
	public void nameGetSet_emptyConstructor_returnEqualName() {
		String expected = "Kyle";
		BasicUser instance = new BasicUser();
		instance.setName(expected);
		String actual = instance.getName();
		assertEquals(expected, actual);
	}

	@Test
	public void compositeGetSet_emptyConstructor_returnEqualComposite() {
		UserComposite composite = new UserListComposite("c");
		BasicUser instance = new BasicUser("Barney");
		instance.setComposite(composite);
		UserComposite expected = composite;
		UserComposite actual = instance.getComposite();
		assertEquals(expected, actual);
	}

	@Test
	public void toString_nameConstructor_getBasicString() {
		BasicUser instance = new BasicUser("Elmer");
		String expected = "BasicUser [name=Elmer, parent=null]";
		String actual = instance.toString();
		assertEquals(expected, actual);
	}

	@Test
	public void hashCode_sameObject_equalHashValues() {
		int expected = new BasicUser("Kelly").hashCode();
		int actual = new BasicUser("Kelly").hashCode();
		assertEquals(expected, actual);
	}

	@Test
	public void equals_nullParam_returnNull() {
		BasicUser instance = new BasicUser("Angela");
		BasicUser other = null;
		boolean expected = false;
		boolean actual = instance.equals(other);
		assertEquals(expected, actual);
	}

	@Test
	public void equals_sameObject_returnTrue() {
		BasicUser instance = new BasicUser("Angela");
		boolean expected = true;
		boolean actual = instance.equals(instance);
		assertEquals(expected, actual);
	}

	@Test
	public void equalsPass_equalObject_returnTrue() {
		BasicUser instance = new BasicUser("Martin");
		BasicUser other = new BasicUser("Martin");
		boolean expected = true;
		boolean actual = instance.equals(other);
		assertEquals(expected, actual);
	}

	@Test
	public void equals_differentObjects_returnFalse() {
		BasicUser instance = new BasicUser("Angela");
		BasicUser other = new BasicUser("Barney");
		boolean expected = false;
		boolean actual = instance.equals(other);
		assertEquals(expected, actual);
	}
}
