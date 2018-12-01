package edu.ccsu.cs417.dgt.adapter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.IOException;

import edu.ccsu.cs417.dgt.strategy.SilentStrategy;
import edu.ccsu.cs417.dgt.strategy.UserNotification;

/**
 *
 * @author ngreeshdfg
 */
public class ActivateTest {

	// TODO implement @Test
	public void testActivateArmException() throws IOException, InterruptedException {
		System.out.println("activateArm");
		UserNotification notifier = new UserNotification(new SilentStrategy());
		Activate instance = new Arm();
		String expResult = "";
		String result = instance.activate(notifier);
		try {
			result = instance.activate(notifier);
		} catch (IOException ex) {
			fail("IOException reported: " + ex.getMessage());
		}
		assertEquals(expResult, result);
	}

	// TODO implement @Test
	public void testActivateDisarmException() throws IOException, InterruptedException {
		System.out.println("activateDisarm");
		UserNotification notifier = new UserNotification(new SilentStrategy());
		Activate instance = new Arm();
		String expResult = "";
		String result = instance.activate(notifier);
		try {
			result = instance.activate(notifier);
		} catch (IOException ex) {
			fail("IOException reported: " + ex.getMessage());
		}
		assertEquals(expResult, result);
	}
}
