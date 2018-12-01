package edu.ccsu.cs417.dgt.factory;

import java.sql.Timestamp;

import edu.ccsu.cs417.dgt.logger.BasicLog;
import edu.ccsu.cs417.dgt.logger.LogInterface;
import edu.ccsu.cs417.dgt.logger.LogTool;

/**
 * Class used to interact with the Abstract Factory
 * 
 * @author Adam
 */
public class BasicLogFactory implements AbstractLogFactory {

	/**
	 * Function getLogDecorator lets you obtain a LogDecorator
	 * 
	 * @param message
	 *            String message for a basic log
	 * @param empty
	 *            String empty parameter, only purpose is to override interface
	 * @return LogInterface log being created
	 */
	@Override
	public LogInterface createLog(String message, String empty) {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		int date = LogTool.getDateInteger(timestamp);
		int time = LogTool.getTimeInteger(timestamp);
		LogInterface log = new BasicLog(date, time, message);
		return log;
	}
}
