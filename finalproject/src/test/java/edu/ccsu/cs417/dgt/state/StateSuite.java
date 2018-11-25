/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.dgt.state;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author curti
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({edu.ccsu.cs417.dgt.state.SecuritySystemTest.class, edu.ccsu.cs417.dgt.state.DisarmedStateTest.class, edu.ccsu.cs417.dgt.state.ArmedStateTest.class, edu.ccsu.cs417.dgt.state.DetectorStateTest.class})
public class StateSuite {

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
