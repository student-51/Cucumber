package Features;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
	features= {"src/test/resources"},	
	glue= {"Features","hello"}
)
	
public class estRunners extends AbstractTestNGCucumberTests {
	
}


