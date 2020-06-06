package com.Etsy_Test.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Assert;

public class StartPage extends BasePage {


    @AndroidFindBy(id = "com.etsy.android:id/btn_link")
    private MobileElement GetStartedButtonElement;

    @Override
    MobileElement getElement(String elementName) {
        MobileElement element = null;

        switch(elementName){

            case "searchTextBoxElement":
                element = searchTextBoxElement;
                break;
            case "GetStartedButtonElement":
                element =GetStartedButtonElement;
                break;

        }
        Assert.assertNotNull(elementName+" element is null",element);
        return element;
    }

    @Override
    public void clickElement(MobileElement element) {
        element.click();
    }

    @Override
    public boolean elementIsEnabled(String elementName) {
        return getElement(elementName).isEnabled();
    }
}
