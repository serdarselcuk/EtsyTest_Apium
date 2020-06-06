package com.Etsy_Test.pages;
import com.Etsy_Test.utils.Driver;
import io.appium.java_client.MobileElement;
import com.Etsy_Test.utils.WaitModels;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Assert;

public class LoginPage extends BasePage{
    final WaitModels wait = new WaitModels();


    /*
    @FindBy(someStrategy) //for browser or Html UI
    @AndroidFindBy(someStrategy)
    @iOSFindBy(someStrategy)
    WebElement someElement;

    @AndroidFindBy(someStrategy)
    @iOSFindBy(someStrategy)
    MobileElement someElement;

    @FindBy(someStrategy)
    @AndroidFindBy(someStrategy)
    @iOSFindBy(someStrategy)
    RemoteWebElement someElement;
    * */
    @AndroidFindBy(id="com.etsy.android:id/edit_username")
    private MobileElement userNameTextBoxElement;

    @AndroidFindBy(id="com.etsy.android:id/edit_password")
    private MobileElement passwordTextBoxElement;

    @AndroidFindBy(id="com.etsy.android:id/button_signin")
    private MobileElement signInButton;

    @AndroidFindBy(id="com.etsy.android:id/forgot_password_link")
    private MobileElement forgotPassword;

    @AndroidFindBy(id="com.etsy.android:id/signin_button_google")
    private MobileElement signInWithGoogle;

    @AndroidFindBy(id="com.etsy.android:id/signin_button_facebook")
    private MobileElement signInWithWithFaceBook;

    @AndroidFindBy(id="com.etsy.android:id/switch_to_register")
    private MobileElement switchToRegister;


    @Override
    public MobileElement getElement(String elementName){

        MobileElement element = null;

                switch(elementName){
            case "userNameTextBoxElement":
                element = userNameTextBoxElement;
                break;
            case "passwordTextBoxElement" :
                element = passwordTextBoxElement;
                break;
            case"signInButton" :
                element = signInButton;
                break;
            case "forgotPassword":
                element = forgotPassword;
                break;
            case "signInWithGoogle":
                element = signInWithGoogle;
                break;
            case "signInWithWithFaceBook":
                element = signInWithWithFaceBook;
                break;
            case "switchToRegister":
                element = switchToRegister;
                break;

        }
        Assert.assertNotNull(elementName+" element is null",element);
        return element;

    }

    @Override
    public void clickElement(MobileElement element) {

    }

    @Override
    public void clickElement(String elementName) {
        MobileElement element = getElement(elementName);
        wait.forElementDisplayed(element);
        element.click();

    }

    @Override
    public boolean elementIsEnabled(String elementName){

        MobileElement element = getElement(elementName);

        wait.forElementDisplayed(element);

        return element.isEnabled();
    }

    public static void main(String[] args) {
        BasePage page = new StartPage();
        page.getElement("GetStartedButtonElement").click();
        System.out.println(Driver.get().getStatus()+"\n"+Driver.get().getSessionDetails());

        System.out.println("click");

        Driver.driverQuit();
    }


}

