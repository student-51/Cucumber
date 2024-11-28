package Features;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	    System.out.println("I want to write a step with precondition");
	    System.out.println("I want to write a step with precondition");
	    System.out.println("I want to write a step with precondition");
	}

	@Given("some other precondition")
	public void some_other_precondition() {
		System.out.println("some other precondition");
		System.out.println("some other precondition");
		System.out.println("some other precondition");
	}

	@When("I complete action")
	public void i_complete_action() {
		System.out.println("I complete action");
		System.out.println("I complete action");
		System.out.println("I complete action");
	}

	@When("some other action")
	public void some_other_action() {
		System.out.println("some other action");
		System.out.println("some other action");
		System.out.println("some other action");
	}

	@When("yet another action")
	public void yet_another_action() {
		System.out.println("some other action");
		System.out.println("some other action");
		System.out.println("some other action");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println("I validate the outcomes");
		System.out.println("I validate the outcomes");
		System.out.println("I validate the outcomes");
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
		System.out.println("check more outcomes");
		System.out.println("check more outcomes");
		System.out.println("check more outcomes");
	}

	@Given("I want to write a step with {string}")
	public void i_want_to_write_a_step_with_name1(String name) {
		System.out.println("I want to write a step with "+name);
		System.out.println("I want to write a step with "+name);
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
		System.out.println("I check for the {int} in step");
		System.out.println("I check for the {int} in step");
		System.out.println("I check for the {int} in step");
	}

	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() {
		System.out.println("I verify the success in step");
		System.out.println("I verify the success in step");
		System.out.println("I verify the success in step");
	}

//	@Given("I want to write a step with name2")
//	public void i_want_to_write_a_step_with_name2() {
//		System.out.println("I want to write a step with name2");
//		System.out.println("I want to write a step with name2");
//		System.out.println("I want to write a step with name2");
//	}
//	
//	@Given("I want to write a step with name3")
//	public void i_want_to_write_a_step_with_name3() {
//		System.out.println("I want to write a step with name3");
//		System.out.println("I want to write a step with name3");
//		System.out.println("I want to write a step with name3");
//	}

	@Then("I verify the Fail in step")
	public void i_verify_the_fail_in_step() {
		System.out.println("I verify the Fail in step");
		System.out.println("I verify the Fail in step");
		System.out.println("I verify the Fail in step");
	}
	@Then("I verify the Pass in step")
	public void i_verify_the_pass_in_step() {
		System.out.println("I verify the Fail in step");
		System.out.println("I verify the Fail in step");
		System.out.println("I verify the Fail in step");
	}
	
}
