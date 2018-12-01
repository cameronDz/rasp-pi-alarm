package edu.ccsu.cs417.dgt.adapter;

import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 *
 * @author curti
 */
public class ActivateBuzzerTest {

	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Test
	public void testActivateArmBuzzerException() throws IOException {
		exception.expect(IOException.class);
		ActivateBuzzer instance = new ArmBuzzer();
		instance.activate();
	}
}
