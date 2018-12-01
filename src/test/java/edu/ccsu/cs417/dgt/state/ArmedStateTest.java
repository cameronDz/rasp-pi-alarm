package edu.ccsu.cs417.dgt.state;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.ccsu.cs417.dgt.strategy.UserNotification;

/**
 * 
 * @author curti
 */
public class ArmedStateTest {

	private final static ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setUp() {
		System.setOut(new PrintStream(outContent));
	}

	@After
	public void tearDown() {
		System.setOut(null);
	}

	/**
	 * Test of arm method, of class ArmedState.
	 */
	@Test
	public void arm_nullNotifier_returnAlreadyArmedAlert() {
		UserNotification notifier = null;
		ArmedState instance = new ArmedState();
		instance.arm(notifier);
		boolean expected = true;
		boolean actual = outContent.toString().contains("System is already armed.");
		assertEquals(expected, actual);
	}

	@Test
	public void disarm() {
		ArmedState instance = new ArmedState();
		instance.disarm();
		boolean expected = true;
		boolean actual = outContent.toString().contains("System has been disarmed.");
		assertEquals(expected, actual);
	}
}
