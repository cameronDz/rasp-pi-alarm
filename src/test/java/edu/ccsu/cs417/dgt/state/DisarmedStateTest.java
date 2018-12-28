package edu.ccsu.cs417.dgt.state;

import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import edu.ccsu.cs417.dgt.strategy.UserNotification;

/**
 * 
 * @author curti
 */
public class DisarmedStateTest {

	@Rule
	public ExpectedException exception = ExpectedException.none();

	// TODO implement @Test
	public void arm_nullNotifier_throwException() throws InterruptedException, IOException {
		exception.expect(IOException.class);
		UserNotification notifier = null;
		DisarmedState instance = new DisarmedState();
		instance.arm(notifier);
	}
}
