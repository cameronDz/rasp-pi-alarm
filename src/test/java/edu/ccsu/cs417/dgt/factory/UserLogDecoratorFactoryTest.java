package edu.ccsu.cs417.dgt.factory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.ccsu.cs417.dgt.logger.LogInterface;

/**
 *
 * @author Cameron
 */
public class UserLogDecoratorFactoryTest {

	@Test
	public void createLog_userLogDecorator() {
		UserLogDecoratorFactory userFactory = new UserLogDecoratorFactory();
		LogInterface log = userFactory.createLog("ONE", "TWO");
		boolean expected = true;
		boolean actual = log.toString().contains("USER: BasicUser");
		assertEquals(expected, actual);
	}
}
