package edu.ccsu.cs417.group2.finalproject.logger;

/**
 * Interface used for LogDecorator Abstract Factory
 * @author Adam
 */
public interface LogDecoratorAbstractFactory {
    /**
     * Method which needs to be implemented for each concrete factory
     * @return LogDecorator
     */
    public LogDecorator createLogDecorator();
}
