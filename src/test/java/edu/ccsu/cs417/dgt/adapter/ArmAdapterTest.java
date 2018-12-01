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
public class ArmAdapterTest {

	// TODO implement @Test
	public void testActivate() throws IOException {
		System.out.println("activate");
		UserNotification notifier = new UserNotification(new SilentStrategy());
		ArmAdapter instance = new ArmAdapter();
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
