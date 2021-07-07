package com.amazon.demo;

import com.amazon.demo.common.DriverFactory;
import com.amazon.demo.listeners.TestListener;
import com.amazon.demo.pageobjects.LaunchPage;
import org.apache.logging.log4j.ThreadContext;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.testng.annotations.*;

/**
 * @author Anand B S
 * @date 04 Jul 2021
 */


@Listeners(TestListener.class)

public class BaseTest {

    @BeforeSuite(alwaysRun = true)
    public void setUp(){
        DriverFactory.initDriver();
    }

    @AfterSuite
    public void close(){
        DriverFactory.quitDriver();
    }
}
