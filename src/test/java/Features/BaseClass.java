package Features;

import io.cucumber.java.After;
import io.cucumber.java.Before;

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
