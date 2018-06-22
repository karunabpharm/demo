package com.ebay.com;

import com.ebay.com.drivers.DriverFactory;
import cucumber.api.java.Before;


public class Hooks {
    DriverFactory driverFactory=new DriverFactory();
    @Before
    public void setUp(){
        driverFactory.openBrowser();
        driverFactory.navigateTo("https://www.ebay.co.uk/");
        driverFactory.applyimpliciwait();


    }
    //@After
    public void tearDown(){
        driverFactory.closeBrowser();

    }
}
