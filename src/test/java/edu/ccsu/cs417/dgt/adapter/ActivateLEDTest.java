package edu.ccsu.cs417.dgt.adapter;

import java.io.IOException;

/**
 *
 * @author Tom
 */
public class ActivateLEDTest {

	// TODO implement @Test
	public void testActivateArmLEDException() throws IOException {
		ActivateLED instance = new ArmLED();
		instance.activate();
	}
}
