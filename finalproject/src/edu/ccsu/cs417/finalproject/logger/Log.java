package edu.ccsu.cs417.finalproject.logger;

/**
 * Class used as the bases for all widget logs
 * @author Cameron
 */
public abstract class Log {
    protected int time;
    protected int date;
    protected String widget;
    
    /**
     * Print out that will be used to store log.
     * @return Since widgets have unique data, String will be unique for each widget
     */
    @Override
    public abstract String toString(); 
    
}
