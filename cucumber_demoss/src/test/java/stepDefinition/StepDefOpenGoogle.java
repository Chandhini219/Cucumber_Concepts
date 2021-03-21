package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefOpenGoogle {
	WebDriver driver;
	
	@Given("The user enter into the google")
	public void the_user_enter_into_the_google() {
	    // Write code here that turns the phrase above into concrete actions
	    System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.google.com/");
	}

	@When("the user is clicks on seach box")
	public void the_user_is_clicks_on_seach_box() {
	    // Write code here that turns the phrase above into concrete actions
	     driver.findElement(By.name("q"));
	}

	@When("the user enters in the search box {string}")
	public void the_user_enters_in_the_search_box(String string) {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.name("q")).sendKeys(string);
	}

	@When("Click on enter button")
	public void click_on_enter_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}

	@Then("the user can view the result")
	public void the_user_can_view_the_result() {
	    // Write code here that turns the phrase above into concrete actions
		boolean status=driver.findElement(By.partialLinkText("pollachi")).isDisplayed();
		if(status)
		{
			System.out.println("Got it");
		}
	    
	}


}
