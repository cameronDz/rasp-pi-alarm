package edu.ccsu.cs417.dgt.user;

import edu.ccsu.cs417.dgt.logger.LogCollection;
import edu.ccsu.cs417.dgt.logger.LoggingService;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author curti
 */
public class UserAdminDecoratorTest {

	/**
	 * Test of getName method, of class UserAdminDecorator.
	 */
	@Test
	public void testGetName() {
		System.out.println("getName");
		UserAdminDecorator instance = new UserAdminDecorator(new BasicUser("Tom"));
		String expResult = "Tom";
		String result = instance.getName();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setName method, of class UserAdminDecorator.
	 */
	@Test
	public void testSetName() {
		System.out.println("setName");
		String name = "Sarah";
		UserAdminDecorator instance = new UserAdminDecorator(new BasicUser("Martha"));
		instance.setName(name);
		String result = instance.getName();
		assertEquals(name, result);
	}

	/**
	 * Test of getStatus method, of class UserAdminDecorator.
	 */
	@Test
	public void testGetStatus() {
		System.out.println("getStatus");
		UserAdminDecorator instance = new UserAdminDecorator(new BasicUser("Karen"));
		String expResult = "Administrator";
		String result = instance.getStatus();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setStatus method, of class UserAdminDecorator.
	 */
	@Test
	public void testSetStatus() {
		System.out.println("setStatus");
		UserAdminDecorator instance = new UserAdminDecorator(new BasicUser("Jason"));
		String expResult = "Moderator";
		instance.setStatus("Moderator");
		String result = instance.getStatus();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getDecoratedUser method, of class UserAdminDecorator.
	 */
	@Test
	public void testGetDecoratedUser() {
		System.out.println("getDecoratedUser");
		BasicUser becky = new BasicUser("Becky");
		UserAdminDecorator instance = new UserAdminDecorator(becky);
		UserInterface expResult = becky;
		UserInterface result = instance.getDecoratedUser();
		assertEquals(expResult, result);
	}

	/**
	 * Test of toString method, of class UserAdminDecorator.
	 */
	@Test
	public void testToString() {
		System.out.println("toString");
		UserAdminDecorator instance = new UserAdminDecorator(new BasicUser("Jason"));
		String expResult = "Jason Administrator";
		String result = instance.toString();
		assertEquals(expResult, result);
	}

	/**
	 * Test of deleteLog method, of class UserAdminDecorator.
	 */
	@Test
	public void testDeleteLog() {
		System.out.println("deleteLog");
		int i = 1;
		UserAdminDecorator instance = new UserAdminDecorator(new BasicUser("Tom"));
		instance.deleteLog(i);
		assertTrue(LoggingService.getInstance().getLogs().equals(new LogCollection()));
	}

	/**
	 * Test of hashCode method, of class UserAdminDecorator.
	 */
	@Test
	public void testHashCode() {
		System.out.println("hashCode");
		UserAdminDecorator instance1 = new UserAdminDecorator(new BasicUser("Kelly"));
		UserAdminDecorator instance2 = new UserAdminDecorator(new BasicUser("Kelly"));
		assertTrue(instance1.hashCode() == instance2.hashCode());
	}

	/**
	 * Testing Equals method with null object parameter
	 */
	@Test
	public void testEqualsNull() {
		System.out.println("equals");
		UserAdminDecorator user = null;
		UserAdminDecorator instance = new UserAdminDecorator(new BasicUser("Angela"));
		boolean expResult = false;
		boolean result = instance.equals(user);
		assertEquals(expResult, result);
	}

	/**
	 * Testing Equals method with same object as parameter
	 */
	@Test
	public void testEqualsThis() {
		System.out.println("equals");
		UserAdminDecorator instance = new UserAdminDecorator(new BasicUser("Angela"));
		boolean expResult = true;
		boolean result = instance.equals(instance);
		assertEquals(expResult, result);
	}

	/**
	 * Testing Equals method with two objects with same name
	 */
	@Test
	public void testEqualsPass() {
		System.out.println("equals");
		UserAdminDecorator user = new UserAdminDecorator(new BasicUser("Angela"));
		UserAdminDecorator instance = new UserAdminDecorator(new BasicUser("Angela"));
		boolean expResult = true;
		boolean result = instance.equals(user);
		assertEquals(expResult, result);
	}

	/**
	 * Testing Equals method with two objects with different names
	 */
	@Test
	public void testEqualsFail() {
		System.out.println("equals");
		UserAdminDecorator user = new UserAdminDecorator(new BasicUser("Barney"));
		UserAdminDecorator instance = new UserAdminDecorator(new BasicUser("Angela"));
		boolean expResult = false;
		boolean result = instance.equals(user);
		assertEquals(expResult, result);
	}

	/**
	 * Testing getComposite method with two objects with different names
	 */
	@Test
	public void testGetSetComposite() {
		System.out.println("getComposite_setComposite");
		UserComposite c = new UserListComposite("c");
		UserInterface u = new BasicUser("Barney");
		UserAdminDecorator instance = new UserAdminDecorator(u);
		instance.setComposite(c);
		UserComposite expResult = c;
		UserComposite result = instance.getComposite();
		assertEquals(expResult, result);
	}
}
