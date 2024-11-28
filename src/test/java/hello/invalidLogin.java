package hello;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class invalidLogin {
	@When("I enter username as {string}")
	public void i_enter_username_as(String username) {
		System.out.println("i entered username as "+username);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String password) {
	    System.out.println("i entered the password as "+password);
	}

	@When("I login")
	public void i_login() {
	    System.out.println("Login is clicked");
	}

	@Then("login should fail with error {string}")
	public void login_should_fail_with_error(String errorMessage) {
	   System.out.println(errorMessage);
	}
}
