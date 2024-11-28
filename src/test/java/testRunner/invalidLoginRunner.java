package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src/test/resources/Features/invalidLogin.feature"},
		glue= {"hello"}
	)
public class invalidLoginRunner extends AbstractTestNGCucumberTests{

}
