package org.cucumber.framework.Cucumber_BDD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue={"org.cucumber.framework.Cucumber_BDD.StepDefinitions"},
features="src\\main\\resources"
)
public class UIRunner {

}
