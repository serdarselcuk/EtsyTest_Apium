package com.Etsy_Test.stepDefinitions;

import com.Etsy_Test.pages.BasePage;
import com.Etsy_Test.pages.StartPage;
import static com.Etsy_Test.utils.Constants.*;
import com.Etsy_Test.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import java.util.List;
public class LoginSteps {

    BasePage page ;
    private SoftAssertions softAssertions ;

    @Given("I should set the test environment")
    public void iAmOnLoginPageAndSetTheTestEnvironment() {
        boolean isAppInstalled = Driver.get().isAppInstalled(APP_WAIT_PACK);
        page = new StartPage();
        Assert.assertTrue("installation of app is: "+isAppInstalled,isAppInstalled);
        softAssertions = new SoftAssertions();
    }

    @Then("areas should be enabled and clickable")
    public void areasShouldBeEnabledAndClickable(List<String>elementList) {

        elementList.forEach(elementName->
            softAssertions
                    .assertThat(page
                            .elementIsEnabled(elementName))
                            .isTrue()
        );
    }


    @Then("if not I should learn them")
    public void ifNotIShouldLearnThem() {
        System.out.println("soft assertion is done below \n");
        softAssertions.assertAll();

    }

    @Given("should be on page: {string}")
    public void shouldBeOn(String pageName) {
        System.out.println("should be on "+ pageName);
        page = page.pageSwitch(pageName);
        System.out.println("switched "+ page.getClass());
    }

    @And("click to button: {string}")
    public void clickToButton(String buttonName) {
        page.clickElement(buttonName);

    }

    @When("I send keys <below> to text Box: {string}")
    public void iSendKeysToTextBoxPasswordRegisterTextBoxElement(String elementName, String password) {
        page.sendKeys(elementName, password);
    }

    @Then("it should be {string} in {string}")
    public void itShouldBeHidden(String situation, String elementName) {
        boolean situationIsMatching = page.matchingSituation(situation, elementName);
        Assert.assertTrue(situationIsMatching);
//        softAssertions.assertThat(situationIsMatching).isTrue();
    }


}
