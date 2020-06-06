package com.Etsy_Test.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import org.junit.Assert;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterPage extends BasePage {
    @AndroidFindBy(id="com.etsy.android:id/edit_first_name")
    private MobileElement firstNameRegisterTextBoxElement;

    @AndroidFindBy(id="com.etsy.android:id/edit_email")
    private MobileElement emailRegisterTextBoxElement;

    @AndroidFindBy(id="com.etsy.android:id/edit_register_password")
    private MobileElement passwordRegisterTextBoxElement;

    @AndroidFindBy(id="com.etsy.android:id/button_show_password")
    private MobileElement show_Hide_PasswordButtonElement;


    @Override
    public boolean elementIsEnabled(String elementName){

        MobileElement element = getElement(elementName);

        wait.forElementDisplayed(element);

        return element.isEnabled();
    }

    @Override
    public MobileElement getElement(String elementName){

        MobileElement element = null;

        switch(elementName){
            case "firstNameRegisterTextBoxElement":
                element = firstNameRegisterTextBoxElement;
                break;
            case "emailRegisterTextBoxElement" :
                element = emailRegisterTextBoxElement;
                break;
            case"passwordRegisterTextBoxElement" :
                element = passwordRegisterTextBoxElement;
                break;
            case "show_Hide_PasswordButtonElement":
                element = show_Hide_PasswordButtonElement;
                break;

        }
        Assert.assertNotNull(elementName+" element is null",element);
        return element;

    }

    @Override
    public void clickElement(MobileElement element) {
        element.click();
    }


}
