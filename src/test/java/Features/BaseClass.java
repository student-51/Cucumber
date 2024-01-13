package Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
	WebDriver driver;
	@Before
	public void beforeScenario() throws InterruptedException {
		System.out.println("Running before Scenario");
		System.out.println("Running before Scenario");
		System.out.println("Running before Scenario");
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		System.out.println("chrome is lauched");
		driver.get("https://www.selenium.dev/documentation/webdriver/browsers/edge/");
		System.out.println("selenium dev website is opened");
		// Thread.sleep(10000);
		// driver.findElement(By.linkText("Downloads")).click();
		// System.out.println("downloads link is clicked");
		// Thread.sleep(10000);
		// driver.findElement(By.linkText("Projects"));
		// System.out.println("Projets link is clicked");
	}
	@After
	public void afterScenario() {
		System.out.println("Running after Scenario");		
		System.out.println("Running after Scenario");		
		System.out.println("Running after Scenario");
		driver.close();
	}
}
