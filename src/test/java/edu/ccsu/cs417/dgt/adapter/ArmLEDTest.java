package edu.ccsu.cs417.dgt.adapter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.IOException;

/**
 *
 * @author Tom
 */
public class ArmLEDTest {

	// TODO implement @Test
	public void testActivate() throws IOException {
		System.out.println("activate");
		ArmLED instance = new ArmLED();
		int expResult = 0;
		int result = instance.activate();
		try {
			result = instance.activate();
		} catch (IOException ex) {
			fail("IOException reported: " + ex.getMessage());
		}
		assertEquals(expResult, result);
	}
}
