package edu.ccsu.cs417.dgt.strategy;

import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author curti
 */
public class SilentStrategyTest {

	@Test
	public void testExecute() throws InterruptedException, IOException {
		SilentStrategy instance = new SilentStrategy();
		instance.execute();
		// assert true if no exceptions are thrown
		assertTrue(true);
	}
}
