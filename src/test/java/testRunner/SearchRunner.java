package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/flipKartFeatures/Search.feature"},
//		glue= {"src/test/java/flipKartFeat[-ures/Search.java"}
//		glue= {"flipKartFeatures"}
		glue= {"classpath:hello"}
	)

public class SearchRunner extends AbstractTestNGCucumberTests {

}
