package com.Etsy_Test.pages;

import com.Etsy_Test.utils.Driver;
import io.appium.java_client.MobileElement;
import org.junit.Assert;

public class SearchFeaturePage extends BasePage{

    @Override
    MobileElement getElement(String elementName) {
        MobileElement element = null;

        switch(elementName){

            case "searchTextBoxElement":
                element = searchTextBoxElement;
                break;
            case "GetStartedButtonElement":

                break;

        }
        Assert.assertNotNull(elementName+" element is null",element);
        return element;
    }

    public static void keyBoardClose(){

        Driver.get().hideKeyboard();
    }

    @Override
    public void clickElement(String elementName) {
        MobileElement element = getElement(elementName);
        wait.forElementDisplayed(element);
        element.click();

    }

    @Override
    public void clickElement(MobileElement element) {
        wait.forElementDisplayed(element);
        element.click();

    }

    @Override
    public boolean elementIsEnabled(String elementName) {
        return getElement(elementName).isEnabled();
    }
}
