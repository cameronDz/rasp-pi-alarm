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
    public WidgetLogDecorator(String widget, LogInterface decoratedLog) {
        super(decoratedLog);
        this.widget = widget;
    }
        
    /**
     * Sets the message which is ultimately printed after the time/date when
     * the toString method is called on the AbstractLog object.
     * @param s String to be set to message variable on decorated log
     */
    @Override
    public void setMessage(String s) {
        s = "WIDGET: " + widget + " ACTION: " + s;
        this.decoratedLog.setMessage(s);
    } 
    
    /**
     * Getter for widget variable
     * @return String of widget
     */
    public String getWidget() {
        return this.widget;
    }
    
    /**
     * Creates hash code value for the log
     * @return integer of the hash code value
     */
    @Override
    public int hashCode() {
        int i = super.hashCode();
        
        i += this.widget.hashCode();
        
        return i;
    }
    
    /**
     * Goes through all variables and checks that they are all equal
     * @param obj Object being compared
     * @return boolean on whether obj is equal to an instance
     */
    @Override
    public boolean equals(Object obj) {
        boolean b = false; 
        
        // makes sure object is not null 
        if( obj == null ) {
            return b;
        } 
        
        // logic checking all variables of two objects are equal
        if( this == obj ){
            b = true;
        } else if( obj instanceof WidgetLogDecorator) {
            WidgetLogDecorator otherObj = (WidgetLogDecorator) obj;
            
            // checks all variables and runs super check
            if( otherObj.getWidget().equals(this.getWidget()) && 
                    super.equals(obj) ) {
                b = true;
            }
        }
        
        return b;
    }
}
