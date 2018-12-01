package edu.ccsu.cs417.dgt.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 *
 * @author curti
 */
public class UserModDecoratorTest {

	@Test
	public void testDeleteUser() {
		String name = "";
		UserModDecorator instance = new UserModDecorator(new BasicUser("Hillary"));
		instance.deleteUser(instance, name);
	}

	@Test
	public void testHashCode() {
		UserModDecorator instance1 = new UserModDecorator(new BasicUser("Kelly"));
		UserModDecorator instance2 = new UserModDecorator(new BasicUser("Kelly"));
		assertTrue(instance1.hashCode() == instance2.hashCode());
	}

	@Test
	public void testGetName() {
		UserModDecorator instance = new UserModDecorator(new BasicUser("Tom"));
		String expResult = "Tom";
		String result = instance.getName();
		assertEquals(expResult, result);
	}

	@Test
	public void testSetName() {
		String name = "Sarah";
		UserModDecorator instance = new UserModDecorator(new BasicUser("Martha"));
		instance.setName(name);
		String result = instance.getName();
		assertEquals(name, result);
	}

	@Test
	public void testGetStatus() {
		UserModDecorator instance = new UserModDecorator(new BasicUser("Karen"));
		String expResult = "Moderator";
		String result = instance.getStatus();
		assertEquals(expResult, result);
	}

	@Test
	public void testSetStatus() {
		UserModDecorator instance = new UserModDecorator(new BasicUser("Jason"));
		String expResult = "Administrator";
		instance.setStatus("Administrator");
		String result = instance.getStatus();
		assertEquals(expResult, result);
	}

	@Test
	public void testGetDecoratedUser() {
		BasicUser becky = new BasicUser("Becky");
		UserModDecorator instance = new UserModDecorator(becky);
		UserInterface expResult = becky;
		UserInterface result = instance.getDecoratedUser();
		assertEquals(expResult, result);
	}

	@Test
	public void testToString() {
		UserModDecorator instance = new UserModDecorator(new BasicUser("Jason"));
		String expResult = "UserModDecorator [BasicUser [name=Jason, parent=null] Moderator]";
		String result = instance.toString();
		assertEquals(expResult, result);
	}

	@Test
	public void testEqualsNull() {
		UserModDecorator user = null;
		UserModDecorator instance = new UserModDecorator(new BasicUser("Angela"));
		boolean expResult = false;
		boolean result = instance.equals(user);
		assertEquals(expResult, result);
	}

	@Test
	public void testEqualsThis() {
		UserModDecorator instance = new UserModDecorator(new BasicUser("Angela"));
		boolean expResult = true;
		boolean result = instance.equals(instance);
		assertEquals(expResult, result);
	}

	@Test
	public void testEqualsPass() {
		UserModDecorator user = new UserModDecorator(new BasicUser("Angela"));
		UserModDecorator instance = new UserModDecorator(new BasicUser("Angela"));
		boolean expResult = true;
		boolean result = instance.equals(user);
		assertEquals(expResult, result);
	}

	@Test
	public void testEqualsFail() {
		UserModDecorator user = new UserModDecorator(new BasicUser("Barney"));
		UserModDecorator instance = new UserModDecorator(new BasicUser("Angela"));
		boolean expResult = false;
		boolean result = instance.equals(user);
		assertEquals(expResult, result);
	}

	@Test
	public void testGetSetComposite() {
		UserComposite c = new UserListComposite("c");
		UserInterface u = new BasicUser("Barney");
		UserModDecorator instance = new UserModDecorator(u);
		instance.setComposite(c);
		UserComposite expResult = c;
		UserComposite result = instance.getComposite();
		assertEquals(expResult, result);
	}
}
