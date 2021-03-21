package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DTLoginwithoutHeader {
	WebDriver driver;
	
	@Given("the user sets the property")
	public void the_user_sets_the_property() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	}

	@Given("the user launches the browser")
	public void the_user_launches_the_browser() {
		 driver=new ChromeDriver();
		    driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("the user enters the credentials below")
	public void the_user_enters_the_credentials_below(DataTable args1) {
		List<String> credentials=args1.asList(String.class);
		String uname=credentials.get(0);
		String pswd=credentials.get(1);
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys(uname);
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys(pswd);
	}

	@Then("the user clicks on submit")
	public void the_user_clicks_on_submit() {
		WebElement submit=driver.findElement(By.id("btnLogin"));
		submit.click();
	} 




}
