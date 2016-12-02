package edu.ccsu.cs417.group2.finalproject.logger;

/**
 * Class WidgetLogDecoratorFactory is a concrete 
 * implementation of the abstract factory for WidgetLogDecorator class
 * @author Adam
 */
public class WidgetLogDecoratorFactory implements LogDecoratorAbstractFactory {
        
    private String widget;
    private final BasicLog decoratedLog;
    /**
     * Constructor for the class
     * @param widget String Text used to decorate the BasicLog
     * @param decoratedLog BasicLog Instance of a basic log which will be decorated
     */
    public WidgetLogDecoratorFactory(String widget, BasicLog decoratedLog) {
        this.widget = widget;
        this.decoratedLog = decoratedLog;
    }
    /**
     * Constructor for the class
     * @return LogDecorator
     */
    @Override
    public LogDecorator createLogDecorator(){
        return new WidgetLogDecorator(widget, decoratedLog);
    }
}
