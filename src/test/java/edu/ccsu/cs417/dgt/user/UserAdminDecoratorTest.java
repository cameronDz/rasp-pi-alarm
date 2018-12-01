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

	@Test
	public void testGetName() {
		UserAdminDecorator instance = new UserAdminDecorator(new BasicUser("Tom"));
		String expResult = "Tom";
		String result = instance.getName();
		assertEquals(expResult, result);
	}

	@Test
	public void testSetName() {
		String name = "Sarah";
		UserAdminDecorator instance = new UserAdminDecorator(new BasicUser("Martha"));
		instance.setName(name);
		String result = instance.getName();
		assertEquals(name, result);
	}

	@Test
	public void testGetStatus() {
		UserAdminDecorator instance = new UserAdminDecorator(new BasicUser("Karen"));
		String expResult = "Administrator";
		String result = instance.getStatus();
		assertEquals(expResult, result);
	}

	@Test
	public void testSetStatus() {
		UserAdminDecorator instance = new UserAdminDecorator(new BasicUser("Jason"));
		String expResult = "Moderator";
		instance.setStatus("Moderator");
		String result = instance.getStatus();
		assertEquals(expResult, result);
	}

	@Test
	public void testGetDecoratedUser() {
		BasicUser becky = new BasicUser("Becky");
		UserAdminDecorator instance = new UserAdminDecorator(becky);
		UserInterface expResult = becky;
		UserInterface result = instance.getDecoratedUser();
		assertEquals(expResult, result);
	}

	@Test
	public void testToString() {
		UserAdminDecorator instance = new UserAdminDecorator(new BasicUser("Jason"));
		String expResult = "UserAdminDecorator [BasicUser [name=Jason, parent=null] Administrator]";
		String result = instance.toString();
		assertEquals(expResult, result);
	}

	@Test
	public void testDeleteLog() {
		int i = 1;
		UserAdminDecorator instance = new UserAdminDecorator(new BasicUser("Tom"));
		instance.deleteLog(i);
		assertTrue(LoggingService.getInstance().getLogs().equals(new LogCollection()));
	}

	@Test
	public void testHashCode() {
		UserAdminDecorator instance1 = new UserAdminDecorator(new BasicUser("Kelly"));
		UserAdminDecorator instance2 = new UserAdminDecorator(new BasicUser("Kelly"));
		assertTrue(instance1.hashCode() == instance2.hashCode());
	}

	@Test
	public void testEqualsNull() {
		UserAdminDecorator user = null;
		UserAdminDecorator instance = new UserAdminDecorator(new BasicUser("Angela"));
		boolean expResult = false;
		boolean result = instance.equals(user);
		assertEquals(expResult, result);
	}

	@Test
	public void testEqualsThis() {
		UserAdminDecorator instance = new UserAdminDecorator(new BasicUser("Angela"));
		boolean expResult = true;
		boolean result = instance.equals(instance);
		assertEquals(expResult, result);
	}

	@Test
	public void testEqualsPass() {
		UserAdminDecorator user = new UserAdminDecorator(new BasicUser("Angela"));
		UserAdminDecorator instance = new UserAdminDecorator(new BasicUser("Angela"));
		boolean expResult = true;
		boolean result = instance.equals(user);
		assertEquals(expResult, result);
	}

	@Test
	public void testEqualsFail() {
		UserAdminDecorator user = new UserAdminDecorator(new BasicUser("Barney"));
		UserAdminDecorator instance = new UserAdminDecorator(new BasicUser("Angela"));
		boolean expResult = false;
		boolean result = instance.equals(user);
		assertEquals(expResult, result);
	}

	@Test
	public void testGetSetComposite() {
		UserComposite c = new UserListComposite("c");
		UserInterface u = new BasicUser("Barney");
		UserAdminDecorator instance = new UserAdminDecorator(u);
		instance.setComposite(c);
		UserComposite expResult = c;
		UserComposite result = instance.getComposite();
		assertEquals(expResult, result);
	}
}
