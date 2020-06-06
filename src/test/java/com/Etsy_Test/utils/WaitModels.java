package com.Etsy_Test.utils;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitModels {

    final WebDriverWait wait = new WebDriverWait( Driver.get(), 20);

    public WaitModels() {
    }

    public void forElementDisplayed(MobileElement element){

       wait.until(ExpectedConditions.visibilityOf(element));

    }

    public WebDriverWait explicitly(){

        return wait;
    }

}
