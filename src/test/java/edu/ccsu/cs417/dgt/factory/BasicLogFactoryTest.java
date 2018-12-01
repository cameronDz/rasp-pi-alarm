package edu.ccsu.cs417.dgt.factory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 *
 * @author Cameron
 */
public class BasicLogFactoryTest {

	@Test
	public void createLog_emptyParam_emptyParamNotInReturn() {
		BasicLogFactory userFactory = new BasicLogFactory();
		boolean expected = false;
		boolean actual = userFactory.createLog("expected", "empty").toString().contains("empty");
		assertEquals(expected, actual);
	}
}
