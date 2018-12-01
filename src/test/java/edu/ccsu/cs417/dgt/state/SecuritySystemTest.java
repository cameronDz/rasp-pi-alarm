package edu.ccsu.cs417.dgt.state;

import edu.ccsu.cs417.dgt.strategy.UserNotification;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * TODO write tests to pass
 * 
 * @author curti
 */
public class SecuritySystemTest {

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
	public void setDetectorState_nullParameter_notAllowNullDetector() {
		DetectorState newDetectorState = null;
		SecuritySystem instance = new SecuritySystem();
		instance.setDetectorState(newDetectorState);
		boolean expected = true;
		boolean actual = outContent.toString().contains("Can not set null detectorState.");
		assertEquals(expected, actual);
	}

	@Test
	public void arm_nullNotifier_throwException() throws InterruptedException, IOException {
		exception.expect(IOException.class);
		UserNotification notifier = null;
		SecuritySystem instance = new SecuritySystem();
		instance.arm(notifier);
	}

	@Test
	public void disarm_emptyConstructor_getAlreadyDisarmedMessage() {
		SecuritySystem instance = new SecuritySystem();
		instance.disarm();
		boolean expected = true;
		boolean actual = outContent.toString().contains("System already disarmed.");
		assertEquals(expected, actual);
	}

	@Test
	public void getIsArmedState_emptyConstructor_equalClassNames() {
		SecuritySystem instance = new SecuritySystem();
		DetectorState armed = new ArmedState();
		String expected = armed.getClass().getSimpleName();
		String actual = instance.getIsArmedState().getClass().getSimpleName();
		assertEquals(expected, actual);
	}

	@Test
	public void getIsDisarmedState_emptyConstructor_equalClassNames() {
		SecuritySystem instance = new SecuritySystem();
		DetectorState armed = new DisarmedState();
		String expected = armed.getClass().getSimpleName();
		String actual = instance.getIsDisarmedState().getClass().getSimpleName();
		assertEquals(expected, actual);
	}
}
