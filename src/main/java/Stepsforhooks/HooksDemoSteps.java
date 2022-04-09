package Stepsforhooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksDemoSteps {
	@Before		
	public void setup() {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get(null);
		
		
	}
	
	
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   
	}

	@When("user enters his valid username and password")
	public void user_enters_his_valid_username_and_password() {
	   
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
	   
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	   
	}


	
	


}
