package edu.ccsu.cs417.dgt.adapter;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

/**
 *
 * @author ngreeshdfg
 */
public class DisarmTest {

	// TODO implement @Test
	public void testDeactivate() throws IOException {
		System.out.println("deactivate");
		Disarm instance = new Disarm();
		String expResult = "";
		String result = instance.deactivate();
		assertEquals(expResult, result);
	}

}
