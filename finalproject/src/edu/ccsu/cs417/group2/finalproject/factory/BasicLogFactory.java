package edu.ccsu.cs417.group2.finalproject.factory;

import edu.ccsu.cs417.group2.finalproject.logger.BasicLog;
import edu.ccsu.cs417.group2.finalproject.logger.LogInterface;

/**
 * Class used to interact with the Abstract Factory
 * @author Adam
 */
public class BasicLogFactory implements AbstractLogFactory {
    /**
     * Function getLogDecorator lets you obtain a LogDecorator
     * @param message message for a basic log
     * @param empty empty parameter, only purpose is to override interface
     * @return LogInterface log being created
     */
    @Override
    public LogInterface createLog(String message, String empty) {
        
        // TODO add time and date
        
        return new BasicLog(1,1,message);
    }
}
