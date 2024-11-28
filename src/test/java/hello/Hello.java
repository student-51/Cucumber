package hello;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hello {
  @Given("^I am at the home page$")
  public void given() throws Throwable {
	  System.out.println("i am at homepage");
  }

  @When("I click on the {word} Option")
  public void when(String tablets) throws Throwable {
	  System.out.println("I am Searching for :"+tablets);
  }

  @Then("^I should able to see Mobile Phones sales page$")
  public void then() throws Throwable {
	  System.out.println("i am at Mobile Phones Sales Page");
  }

  @And("The title should be {string}")
  public void and(String title) throws Throwable {
	  System.out.println(title);
  }
  
  @Then("^I click on one mobile$")
  public void clickMobile() throws Throwable {
	  System.out.println("mobile is clicked");
  }
  @Then("^I should able to redirect to same mobile sales page$")
  public void open() throws Throwable {
	  System.out.println("Redirected to mobile sales page");
  }
  
}
