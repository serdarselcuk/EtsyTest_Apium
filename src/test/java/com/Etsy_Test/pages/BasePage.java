package com.Etsy_Test.pages;

import com.Etsy_Test.utils.Driver;
import com.Etsy_Test.utils.WaitModels;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class BasePage {
    WaitModels wait = new WaitModels();

    @AndroidFindBy(id = "com.etsy.android:id/search_src_text")
    MobileElement searchTextBoxElement;

    @AndroidFindBys(@AndroidBy(className = "android.widget.TextView"))
    List<MobileElement> populerElementList;

    BasePage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.get(),
                        Duration.ofSeconds(10)),this);
    }
    public List<MobileElement> elementList(String elementName){
        return populerElementList;
    }

    public BasePage pageSwitch(String pageName){
        BasePage page;
        switch (pageName){
            case "RegisterPage":
                page = new RegisterPage();
                break;
            case "LoginPage":
                page = new LoginPage();
                break;
            default:
                page = new StartPage();
        }
        return page;
    }

    public boolean isAppInstalled(){
        return Driver.get().isAppInstalled("com.etsy.android");
    }

    public abstract boolean elementIsEnabled(String element);

    abstract MobileElement getElement(String elementName);

    public abstract void clickElement(MobileElement element);

    public void clickElement(String elementName) {
        MobileElement element = getElement(elementName);
        wait.forElementDisplayed(element);
        element.click();

    }

    public void sendKeys(String elementName, String key) {
        MobileElement element = getElement(elementName);
        wait.forElementDisplayed(element);
        element.sendKeys(key);
    }

    public String getElementText(String elementName){

        MobileElement element = getElement(elementName);
        wait.forElementDisplayed(element);
        return element.getText();

    }

    public boolean matchingSituation(String situation, String elementName){
        Pattern pattern = Pattern.compile("\\W");//not word character ,./';!@#$%^&;

        if ("shown".equals(situation)) {
            pattern = Pattern.compile("\\w");//if shown it will any word character
        }

        Matcher matcher = pattern.matcher(getElementText(elementName));

        return matcher.find();

    }
}
