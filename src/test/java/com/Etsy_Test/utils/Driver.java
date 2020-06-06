package com.Etsy_Test.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import static com.Etsy_Test.utils.Constants.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Driver extends DesiredCap {

    private static AppiumDriver<MobileElement> driver;
    private static DesiredCapabilities caps;

    public static AppiumDriver<MobileElement> get() {

            try {

                caps = caps == null? new DesiredCapabilities(getCapability()) : caps;
                driver = driver == null? new AppiumDriver<>(new URL(URL), caps) : driver;

            } catch (MalformedURLException e) {
                e.printStackTrace();
            }

        return driver;
    }

    public static void driverQuit(){

        if(driver != null)
            driver.quit();

        driver = null;
    }

}
