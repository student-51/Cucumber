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

	@Before(order=2)
	public void b() throws InterruptedException {
		System.out.println("Running before Scenario 2");
	}
	@Before(order=3)
	public void a() throws InterruptedException {
		System.out.println("Running before Scenario 3");
	}
	@After(order=3)
	public void z() {
		System.out.println("Running after Scenario 1");		
	}
	@After(order=2)
	public void y() {
		System.out.println("Running after Scenario 2");		
	}
	@After(order=1)
	public void x() {
		System.out.println("Running after Scenario 3");		
		System.out.println("====================================");		
		System.out.println("====================================");		
	}
}
