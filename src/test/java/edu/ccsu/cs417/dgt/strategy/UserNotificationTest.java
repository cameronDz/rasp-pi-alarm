package edu.ccsu.cs417.dgt.strategy;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author curti
 */
public class UserNotificationTest {

	private final static ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setUp() {
		System.setOut(new PrintStream(outContent));
	}

	@After
	public void tearDown() {
		System.setOut(null);
	}

	@Test
	public void testChangeStrategy() {
		UserNotificationStrategy strategy = new BuzzerStrategy();
		UserNotification instance = new UserNotification(new SilentStrategy());
		instance.changeStrategy(strategy);
		boolean expected = true;
		boolean actual = outContent.toString().contains("Intruder detected!");
		assertEquals(expected, actual);
	}

	@Test
	public void testNotifyUser() throws InterruptedException, IOException {
		UserNotification instance = new UserNotification(new SilentStrategy());
		instance.notifyUser();
		// assert true if no exception thrown
		assertTrue(true);
	}
}
