package edu.ccsu.cs417.dgt.adapter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.IOException;

/**
 *
 * @author Tom
 */
public class DisarmLEDTest {

	// TODO implement @Test
	public void testDeactivate() throws IOException {
		System.out.println("deactivate");
		DisarmLED instance = new DisarmLED();
		int expResult = 0;
		int result = instance.deactivate();
		try {
			result = instance.deactivate();
		} catch (IOException ex) {
			fail("IOException reported: " + ex.getMessage());
		}
		assertEquals(expResult, result);
	}

}
