/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.group2.finalproject.logger;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author ngreeshdfg
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({edu.ccsu.cs417.group2.finalproject.adapter.ArmTest.class, edu.ccsu.cs417.group2.finalproject.adapter.ActivateTest.class, edu.ccsu.cs417.group2.finalproject.logger.LoggingServiceTest.class, edu.ccsu.cs417.group2.finalproject.logger.BasicLogTest.class, edu.ccsu.cs417.group2.finalproject.adapter.DisarmTest.class, edu.ccsu.cs417.group2.finalproject.adapter.ArmAdapterTest.class, edu.ccsu.cs417.group2.finalproject.logger.LogCollectionTest.class})
public class LoggerSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}