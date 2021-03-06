package edu.ccsu.cs417.dgt.strategy;

import java.io.IOException;

import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author curti
 */
public class SilentStrategyTest {

	@Rule
	public ExpectedException exception = ExpectedException.none();

	// TODO implement @Test after fixing varying results
	public void execute_noPython_throwException() throws InterruptedException, IOException {
		exception.expect(IOException.class);
		SilentStrategy instance = new SilentStrategy();
		instance.execute();
	}
}
