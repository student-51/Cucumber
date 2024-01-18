package Features;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Logout {
  @Given("^I press Logout button$")
  public void given() throws Throwable {
	  System.out.println("logout button is visible");
	  System.out.println("click on logout button");
	  System.out.println("click on logout button");
  }

  @Then("^I should Logout from the application$")
  public void then() throws Throwable {
	  System.out.println("Home page should display");
	  System.out.println("Home page should display");
  }

}
