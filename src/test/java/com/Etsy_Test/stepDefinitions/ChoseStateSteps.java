package com.Etsy_Test.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class ChoseStateSteps {
    String string = "initialized at the begining";
    /*
    MobileElement webview = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable("
                + "new UiSelector().scrollable(true)).scrollIntoView("
                + "new UiSelector().textContains(\"WebView\"));"));
    */

    @Given("this is given in start scenario")
    public void thisIsGivenInStartScenario() {
        System.out.println("this is given in start scenario");
    }

    @When("This is when in start scenario")
    public void thisIsWhenInStartScenario() {
        System.out.println("This is when in start scenario");
    }

    @Then("This is then in start scenario")
    public void thisIsThenInStartScenario(List<String> list) {
        System.out.println("This is then in start scenario" + list);
    }

    @Given("this is given in start scenario outLine row {int} row {int}")
    public void this_is_given_in_start_scenario_outLine_row_row(Integer int1, Integer int2) {
        System.out.println(int1 +" " + int2 + " given" );
    }

    @When("This is when in start scenario outLine row {int} row {int}")
    public void this_is_when_in_start_scenario_outLine_row_row(Integer int1, Integer int2) {
        System.out.println(int1 +" " + int2 + " when" );
        string = "initialized on " +int1 +" " + int2 + " when";
    }

    @Then("This is then in start scenario outLine row {int} row {int}")
    public void thisIsThenInStartScenarioOutLineFirstColumnSecondColumn(Integer int1, Integer int2) {
        System.out.println(int1 +" " + int2 + " then" );
        System.out.println(string);
    }

    @Given("BackGround is here")
    public void backgroundIsHere() {
        System.out.println("BackGround is here");
        System.out.println(string);
    }

}