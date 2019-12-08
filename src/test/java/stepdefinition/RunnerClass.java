package stepdefinition;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/resources/java/feature1.feature"
		,glue={"stepdefinition"}
		)
public class RunnerClass {

}
