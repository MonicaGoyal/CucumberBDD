package StepsforBackground;

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
import junit.framework.Assert;

public class StepDefinitionbackground {
	

WebDriver driver=null;
	@Before
	public void setup() {
     WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		
		
		
	}
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");		
	}

	@When("user enters his valid username and password")
	public void user_enters_his_valid_username_and_password() {
		driver.findElement(By.name("login")).sendKeys("moni81@rediffmail.com");
		driver.findElement(By.name("passwd")).sendKeys("Naivedya@123");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		driver.findElement(By.name("proceed")).click();	
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	
			
	}

	@When("user clicks write mail button")
	public void user_clicks_write_mail_button() {
	
	driver.findElement(By.xpath("//b[text()=\"Write mail\"]")).click();
		
	}

	@Then("compose mail option opens")
	public void compose_mail_option_opens() {
	}

    @After
	public void teardown() {
	driver.quit();	
		

}
}