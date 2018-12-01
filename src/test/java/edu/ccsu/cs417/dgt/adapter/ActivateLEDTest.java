package edu.ccsu.cs417.dgt.adapter;

import java.io.IOException;

import org.junit.Test;

/**
 *
 * @author Tom
 */
public class ActivateLEDTest {

	@Test
	public void testActivateArmLEDException() throws IOException {
		ActivateLED instance = new ArmLED();
		instance.activate();
	}
}
