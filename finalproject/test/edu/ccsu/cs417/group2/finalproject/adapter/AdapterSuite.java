/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.group2.finalproject.adapter;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Tom
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({DisarmBuzzerTest.class, ArmAdapterLEDTest.class, ActivateBuzzerTest.class, DisarmTest.class, ArmBuzzerTest.class, ActivateTest.class, DisarmLEDTest.class, ArmAdapterTest.class, ArmTest.class, ArmAdapterBuzzerTest.class, ActivateLEDTest.class, ArmLEDTest.class})
public class AdapterSuite {

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
