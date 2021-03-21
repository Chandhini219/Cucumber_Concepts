package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage1 {
	WebDriver driver;
	@Given("the user is entering into the portal")
	public void the_user_is_entering_into_the_portal() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	}

	@When("user is typing in the username and password")
	public void user_is_typing_in_the_username_and_password() {
	WebElement username=driver.findElement(By.id("txtUsername"));
	username.sendKeys("Admin");
	WebElement password=driver.findElement(By.id("txtPassword"));
	password.sendKeys("admin123");
	
	}

	@When("the user is click on the submit button.")
	public void the_user_is_click_on_the_submit_button() {
	WebElement submit=driver.findElement(By.id("btnLogin"));
	submit.click();
		
	}




}
