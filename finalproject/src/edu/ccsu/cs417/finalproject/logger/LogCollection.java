package edu.ccsu.cs417.finalproject.logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * A Collection of widget logs with an inner iterator class to iterate through
 * logs.
 * @author Cameron
 * @param <T> List of logs.
 */
public class LogCollection<T extends Log> {
    
    private List<T> logs;
    
    /**
     * Constructor creates an ArrayList of generic T
     */
    public LogCollection() {
        logs = new ArrayList<>(); 
    }
    
    /**
     * Adds a Log to the Collection of logs
     * @param t generic Log to be added to the list of logs in the Collection
     */
    public void addLog(T t) {
        logs.add(t);
    }
    
    public Iterator<T> iterator() {
        return new LogCollectionIterator<>(logs.iterator());
    }
    
    /**
     * Inner iterator class to cycle through list of generic Logs
     */
    private static class LogCollectionIterator<S> implements Iterator {
        
        // S is the same as T in the outer class
        private Iterator<S> logIter;

        /**
         * Constructor
         * @param logIter Outer classes data
         */
        private LogCollectionIterator(Iterator<S> logIter){
            // Reference outer class instance variables
            this.logIter = logIter;
        }

        /**
         * Checks for another element to be iterated over
         * @return Whether another element is available to be iterated upon
         */
        @Override
        public boolean hasNext() {
            if( logIter.hasNext() ){
                return true;
            } else {
                return false;
            }
        }

        /**
         * Getter for next element in List
         * @return Next element in List to be iterated upon
         */
        @Override
        public S next() {
            if( logIter.hasNext() ){
                return logIter.next();
            } else {
                throw new NoSuchElementException();
            }
        }

        /**
         * Must be implemented since Iterator interface has this method.
         * No current functionality except throwing an exception.
         */
        @Override
        public void remove() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }
    }    
}
