package edu.ccsu.cs417.dgt.strategy;

import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 *
 * @author curti
 */
public class BuzzerStrategyTest {

	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Test
	public void execute_noPython_throwException() throws InterruptedException, IOException {
		exception.expect(InterruptedException.class);
		BuzzerStrategy instance = new BuzzerStrategy();
		instance.execute();
	}
}
