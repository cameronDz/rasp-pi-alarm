package edu.ccsu.cs417.dgt.strategy;

import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author curti
 */
public class BuzzerStrategyTest {

	@Test
	public void testExecute() throws InterruptedException, IOException { 
		BuzzerStrategy instance = new BuzzerStrategy();
		instance.execute();
		// assert true if no exceptions are thrown
		assertTrue(true);
	}
}
