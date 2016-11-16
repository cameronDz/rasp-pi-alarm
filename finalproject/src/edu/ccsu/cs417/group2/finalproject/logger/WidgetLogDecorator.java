package edu.ccsu.cs417.group2.finalproject.logger;

/**
 * Log that tracks Widget actions
 * @author Cameron
 */
public class WidgetLogDecorator extends LogDecorator {
    
    protected String widget;
    
    /**
     * Constructor for abstract object.
     * @param decoratedLog object being wrapped by class
     * @param widget String representation of the widget being logged
     */
    public WidgetLogDecorator(String widget, AbstractLog decoratedLog) {
        super(decoratedLog);
        this.widget = widget;
        this.setMessage("");
    }
        
    /**
     * Sets the message which is ultimately printed after the time/date when
 the toString method is called on the AbstractLog object.
     * @param s String to be set to message variable on decorated log
     */
    @Override
    public void setMessage(String s) {
        s = "WIDGET: " + widget + " ACTION: " + action;
        this.decoratedLog.setMessage(s);
    } 
}
