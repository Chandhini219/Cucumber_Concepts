package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


public class HooksNormal {
	
	@Given("the user is switching on the phone")
	public void the_user_is_switching_on_the_phone() {
	    System.out.println("aaaaaaaaaaaaaaaaa");
	}

	@Given("user should get the lock screen")
	public void user_should_get_the_lock_screen() {
		 System.out.println("bbbbbbbbbbbbbbbb");
	}

	@When("user entered the password")
	public void user_entered_the_password() {
		 System.out.println("cccccccccccccccc");
	}

	@Then("the user should moved to display screen")
	public void the_user_should_moved_to_display_screen() {
		 System.out.println("dddddddddddddddd");
	}

	@Then("the user can make a call")
	public void the_user_can_make_a_call() {
		 System.out.println("eeeeeeeeeeeeeeeee");
	}


}
