package edu.ccsu.cs417.dgt.state;

import edu.ccsu.cs417.dgt.strategy.UserNotification;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

/**
 * 
 * @author curti
 */
public class SecuritySystemTest {

	@Rule
	public ExpectedException exception = ExpectedException.none();

        // TODO implement @Test
	public void arm_nullNotifier_throwException() throws InterruptedException, IOException {
		exception.expect(IOException.class);
		UserNotification notifier = null;
		SecuritySystem instance = new SecuritySystem();
		instance.arm(notifier);
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
