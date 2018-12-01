package edu.ccsu.cs417.dgt.factory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.ccsu.cs417.dgt.logger.LogInterface;

/**
 *
 * @author Cameron
 */
public class WidgetLogDecoratorFactoryTest {

	@Test
	public void createLog_widgetFactory_logToStringContainsWidgetString() {
		WidgetLogDecoratorFactory widgetFactory = new WidgetLogDecoratorFactory();
		LogInterface log = widgetFactory.createLog("ONE", "TWO");
		boolean expected = true;
		boolean actual = log.toString().contains("WIDGET: ONE ACTION: TWO");
		assertEquals(expected, actual);
	}
}
