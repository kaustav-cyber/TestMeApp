package feature_Project.Driver_runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features="features",
		glue= {"StepDefinition"}
		)
public class LoginTestRunner {

}
