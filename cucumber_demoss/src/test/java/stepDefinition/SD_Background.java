package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_Background {
	
	@Given("The student finishes high school")
	public void the_student_finishes_high_school() {
	    System.out.println("The student finishes high school");
	}

	@Given("The student finishes higher school")
	public void the_student_finishes_higher_school() {
	    System.out.println("The student finishes higher school");
	}

	@Given("the student applied for medical course")
	public void the_student_applied_for_medical_course() {
	    System.out.println("the student applied for medical course");
	}

	@When("the student cleared the entrance exam")
	public void the_student_cleared_the_entrance_exam() {
	   System.out.println("the student cleared the entrance exam");
	}

	@Then("the student is eligible for joining any medical insitite")
	public void the_student_is_eligible_for_joining_any_medical_insitite() {
	   System.out.println("the student is eligible for joining any medical insitite");
	}

	@Given("the student applied for an engineering college")
	public void the_student_applied_for_an_engineering_college() {
	    System.out.println("the student applied for an engineering college");
	}

	@When("the stident has a sylaabus cutt off")
	public void the_stident_has_a_sylaabus_cutt_off() {
	    System.out.println("the student has a sylaabus cutt off ");
	}

	@Then("the student is eligible for joining an engineering institute")
	public void the_student_is_eligible_for_joining_an_engineering_institute() {
		System.out.println("The student is eligible for joining an enginerring institute");
	    
	}




}
