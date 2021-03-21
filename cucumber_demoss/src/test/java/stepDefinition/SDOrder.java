package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SDOrder {
	@Given("when the user enters display one")
	public void when_the_user_enters_display_one() {
	    System.out.println("1111111111111");
	}

	@Then("it displays two")
	public void it_displays_two() {
		System.out.println("22222222222");
	}

	@Then("it displays three")
	public void it_displays_three() {
		System.out.println("333333333333");
	}

	@Then("it displays four")
	public void it_displays_four() {
		System.out.println("4444444444444");
	}

	@When("it ends it displays five")
	public void it_ends_it_displays_five() {
		System.out.println("5555555555555");
	}



}
