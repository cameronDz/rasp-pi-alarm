package edu.ccsu.cs417.dgt.state;

import edu.ccsu.cs417.dgt.strategy.UserNotification;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * TODO write tests to pass
 * @author curti
 */
public class DetectorStateTest {
    
    public DetectorStateTest() {
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
     * Test of arm method, of class DetectorState.
     * @throws java.lang.Exception
     */
    @Test
    public void testArm() throws Exception {
        System.out.println("arm");
        UserNotification notifier = null;
        DetectorState instance = new DetectorStateImpl();
        instance.arm(notifier);
    }

    /**
     * Test of disarm method, of class DetectorState.
     */
    @Test
    public void testDisarm() {
        System.out.println("disarm");
        DetectorState instance = new DetectorStateImpl();
        instance.disarm();
    }

    public class DetectorStateImpl implements DetectorState {

        @Override
        public void arm(UserNotification notifier) throws IOException {
        }

        @Override
        public void disarm() {
        }
    }    
}
