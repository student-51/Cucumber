package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/resources/Features/dataTable.feature"},
		glue= {"Features"}
)

public class dataRunner extends AbstractTestNGCucumberTests{
	
	
}
