/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.dgt.logger;

import java.sql.Timestamp;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Cameron
 */
public class LogToolTest {
    
    @Test
    public void testGetDateInteger() {
        Timestamp timestamp = Timestamp.valueOf("1995-05-01 05:45:11");
        int expected = 19950501;
        int actual = LogTool.getDateInteger(timestamp);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetTimeInteger() {
        Timestamp timestamp = Timestamp.valueOf("1995-05-01 05:45:11");
        int expected = 54511;
        int actual = LogTool.getTimeInteger(timestamp);
        assertEquals(expected, actual);
    }
}
