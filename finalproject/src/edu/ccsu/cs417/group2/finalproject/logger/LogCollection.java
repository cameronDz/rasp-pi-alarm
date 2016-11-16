package edu.ccsu.cs417.group2.finalproject.logger;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * A Collection of widget logs with an inner iterator class to iterate through
 * logs. CS417 lecture slides were used as a reference. 
 * @author Cameron
 * @param <T> List of logs.
 */
public class LogCollection<T extends AbstractLog> extends AbstractCollection {
    
    private List<T> logs;
    private int size; 
    
    /**
     * Constructor creates an ArrayList of generic T
     */
    public LogCollection() {
        logs = new ArrayList<>(); 
        size = 0;
    }
    
    /**
     * Adds a Log to the Collection of logs, 
     * @param t generic Log to be added to the list of logs in the Collection
     */
    public void addLog(T t) {
        logs.add(t);
        size++;
    }
    
    /**
     * Implements method to get collection size
     * @return number of logs in the collection
     */
    @Override
    public int size() {
        return size;
    }
    
    /**
     * Way to cycle through all the Logs in the 
     * @return Iterator that allows cycling through Logs in collection
     */
    @Override
    public Iterator<T> iterator() {
        return new LogCollectionIterator<>(logs.iterator());
    }
    
    /**
     * Iterates through the collections and creates a String of all the Logs.
     * @return A string representation of all the logs
     */
    @Override
    public String toString() {
        String s = "";        
        Iterator itr = logs.iterator();
        
        while(itr.hasNext()) {
            s += itr.next().toString() + "\n";
        }
        
        return s;
    }
    
    /**
     * Inner iterator class to cycle through list of generic Logs. This section
     * was created using CS417 lecture slide notes as a reference.
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
            throw new UnsupportedOperationException("Not supported."); 
        }
    }    
}
