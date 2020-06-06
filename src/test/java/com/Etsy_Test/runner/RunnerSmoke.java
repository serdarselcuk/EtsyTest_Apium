package com.Etsy_Test.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources\\features",
        glue = "com\\Etsy_Test\\stepDefinitions",
        strict = true,
        dryRun = false,
        tags = { },
        plugin = {}
)
public class RunnerSmoke {

}

//features -> source
//src\test\resources\features -> content

//com\Etsy_Test\stepDefinitions
//src\test\java\com\Etsy_Test\stepDefinitions
