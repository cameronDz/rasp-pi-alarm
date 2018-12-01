package edu.ccsu.cs417.dgt.state;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import edu.ccsu.cs417.dgt.strategy.UserNotification;

/**
 * 
 * @author curti
 */
public class DisarmedStateTest {

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
	public void arm_nullNotifier_throwException() throws InterruptedException, IOException {
		exception.expect(IOException.class);
		UserNotification notifier = null;
		DisarmedState instance = new DisarmedState();
		instance.arm(notifier);
	}

	@Test
	public void disarm_emptyConstructor_getAlreadyArmedMessage() {
		DisarmedState instance = new DisarmedState();
		instance.disarm();
		boolean expected = true;
		boolean actual = outContent.toString().contains("System already disarmed.");
		assertEquals(expected, actual);
	}
}
