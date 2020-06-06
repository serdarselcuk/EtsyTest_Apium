package com.Etsy_Test.stepDefinitions;

import com.Etsy_Test.pages.BasePage;
import com.Etsy_Test.pages.SearchFeaturePage;
import com.Etsy_Test.utils.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {
    AppiumDriver<MobileElement> driver;


    @Before
    public void startUp(){
        Driver.get();
    }

    @After
    public void tearsDown(){
        Driver.driverQuit();

    }
    @After("@searchTest")
    public void printResult(){
        BasePage page = new SearchFeaturePage();
        page.elementList("a").forEach(p-> System.out.println(p.getText()));
    }
}
