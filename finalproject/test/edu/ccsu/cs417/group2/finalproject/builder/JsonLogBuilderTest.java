package edu.ccsu.cs417.group2.finalproject.builder;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cameron
 */
public class JsonLogBuilderTest {
    
    public JsonLogBuilderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of buildTime method, of class JsonLogBuilder.
     */
    @Test
    public void testBuildTime() {
        System.out.println("buildTime");
        int time = 1;
        JsonLogBuilder instance = new JsonLogBuilder();
        instance.buildTime(time);
        String expResult = "{\"time\": 1}";
        String result = instance.getJsonLog();
        assertEquals(expResult, result);
    }

    /**
     * Test of buildDate method, of class JsonLogBuilder.
     */
    @Test
    public void testBuildDate() {
        System.out.println("buildDate");
        int date = 1;
        JsonLogBuilder instance = new JsonLogBuilder();
        instance.buildDate(date);
        String expResult = "{\"date\": 1}";
        String result = instance.getJsonLog();
        assertEquals(expResult, result);
    } 

    /**
     * Test of buildMessage method, of class JsonLogBuilder.
     */
    @Test
    public void testBuildMessage() {
        System.out.println("buildMessage");
        JsonLogBuilder instance = new JsonLogBuilder();
        String message = "message";
        instance.buildMessage(message);
        String expResult = "{\"messsage\": \"" + message + "\"}";
        String result = instance.getJsonLog();
        assertEquals(expResult, result);
    }

    /**
     * Test of getJsonLog method, of class JsonLogBuilder.
     */
    @Test
    public void testGetJsonLog() {
        System.out.println("getJsonLog");
        JsonLogBuilder instance = new JsonLogBuilder();
        instance.buildDate(1);
        String expResult = "{\"date\": 1}";
        String result = instance.getJsonLog();
        assertEquals(expResult, result);
    }

    /**
     * Test of getJsonVariable method, of class JsonLogBuilder.
     */
    @Test
    public void testGetJsonVariableNonEmpty() {
        System.out.println("getJsonVariable-nonEmpty");
        JsonLogBuilder instance = new JsonLogBuilder();
        instance.buildDate(1);
        String expResult = "{\"date\": 1";
        String result = instance.getJsonVariable();
        assertEquals(expResult, result);
    }

    /**
     * Test of getJsonVariable method, of class JsonLogBuilder.
     */
    @Test
    public void testGetJsonVariableEmpty() {
        System.out.println("getJsonVariable-empty");
        JsonLogBuilder instance = new JsonLogBuilder();
        String expResult = "";
        String result = instance.getJsonVariable();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of toString method, of class JsonLogBuilder.
     */
    @Test
    public void testToStringNonEmpty() {
        System.out.println("toString-non-empty");
        JsonLogBuilder instance = new JsonLogBuilder();
        instance.buildDate(1);
        String expResult = "JsonLogBuilder:\n" + "{\"date\": 1";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of toString method, of class JsonLogBuilder.
     */
    @Test
    public void testToStringEmpty() {
        System.out.println("toString-empty");
        JsonLogBuilder instance = new JsonLogBuilder();
        String expResult = "JsonLogBuilder:\n" + null;
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of hashCode method, of class JsonLogBuilder.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        JsonLogBuilder instance = new JsonLogBuilder();
        int expResult = instance.getJsonVariable().hashCode();
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class JsonLogBuilder.
     */
    @Test
    public void testEquals() {
        System.out.println("equals-false");
        Object obj = new Object();
        JsonLogBuilder instance = new JsonLogBuilder();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
}
