package edu.ccsu.cs417.dgt.strategy;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

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

	@Rule
	public ExpectedException exception = ExpectedException.none();

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
	public void execute_noPython_throwException() throws InterruptedException, IOException {
		exception.expect(IOException.class);
		UserNotification instance = new UserNotification(new SilentStrategy());
		instance.notifyUser();
	}
}
