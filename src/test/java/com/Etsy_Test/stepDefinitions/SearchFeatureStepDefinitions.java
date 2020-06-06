package com.Etsy_Test.stepDefinitions;

import com.Etsy_Test.pages.BasePage;
import com.Etsy_Test.pages.SearchFeaturePage;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchFeatureStepDefinitions{
    BasePage page;

    @Then("popular topics should be listed")
    public void popularTopicsShouldBeListed() {
        page = new SearchFeaturePage();
        Assert.assertTrue(page.elementList("populerElementList").size()>0);
    }

    @When("I close the keyboard")
    public void iCloseTheKeyboard() {
        SearchFeaturePage.keyBoardClose();
    }

    @Then("List should be includes {int} element")
    public void listShouldBeIncludesElement(int num) {

        Assert.assertTrue(page.elementList("populerElementList").size()>=num);

    }

    @When("click to {int} \\(st) element in the list")
    public void clickToStElementInTheList(int num) {

        page.clickElement(page.elementList("populerElementList").get(num));
    }
}
