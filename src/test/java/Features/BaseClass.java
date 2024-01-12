package Features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
//	@BeforeAll
//	public void befScenario() {
//		System.out.println("Running before all Scenario");
//		System.out.println("Running before all Scenario");
//		System.out.println("Running before all Scenario");		
//	}
//	@AfterAll
//	public void aftScenario() {
//		System.out.println("Running after all Scenario");		
//		System.out.println("Running after all Scenario");		
//		System.out.println("Running after all Scenario");		
//	}
	
	@Before
	public void beforeScenario() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		System.out.println("Running before Scenario");
		System.out.println("Running before Scenario");
		System.out.println("Running before Scenario");
	}
	@After
	public void afterScenario() {
		System.out.println("Running after Scenario");		
		System.out.println("Running after Scenario");		
		System.out.println("Running after Scenario");		
	}
}
