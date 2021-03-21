package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Login_Parameter {
	WebDriver driver;
	@Given("the user is navigating into the portal")
	public void the_user_is_navigating_into_the_portal() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("user is entering in the {string} and {string}")
	public void user_is_entering_in_the_and(String uname, String pswd) {
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys(uname);
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys(pswd);
	}

	@When("click the login button.")
	public void click_the_login_button() {
		WebElement submit=driver.findElement(By.id("btnLogin"));
		submit.click();
	}
}