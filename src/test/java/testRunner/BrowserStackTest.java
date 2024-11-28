package testRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class BrowserStackTest {
	public static final String USERNAME = "biswajitsamal_rLhWi8"; // Replace with your BrowserStack username
    public static final String AUTOMATE_KEY = "qwHvPszzJT4yJBWMdxdZ"; // Replace with your BrowserStack access key
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";

    public static void main(String[] args) throws Exception {
    	
        // Set DesiredCapabilities for BrowserStack
        DesiredCapabilities caps = new DesiredCapabilities();
        
        caps.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
        caps.setCapability("browser_version", "113.0"); // Specify browser version
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("name", "BrowserStackTest"); // Test name on BrowserStack dashboard
        caps.setCapability("build", "Build 1");         // Build name on BrowserStack dashboard

        // Instantiate RemoteWebDriver with BrowserStack's URL
        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);

        try {
            // Perform a simple Google search test
            driver.get("https://www.google.com");
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("BrowserStack");
            searchBox.submit();

            System.out.println("Title of the page is: " + driver.getTitle());
            
        } finally {
        	
            driver.quit(); // Quit the session
            
        }
        
    }
}
