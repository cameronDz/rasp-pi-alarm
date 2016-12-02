package edu.ccsu.cs417.group2.finalproject.logger;

/**
 * Class used to interact with the Abstract Factory
 * @author Adam
 */
public class LogDecoratorFactory {
    /**
     * Function getLogDecorator lets you obtain a LogDecorator
     * @param factory LogDecoratorAbstractFactory Specifies which concrete factory will be used
     * @return LogDecorator
     */
    public static LogDecorator getLogDecorator(LogDecoratorAbstractFactory factory) {
        return factory.createLogDecorator();
    }
}
