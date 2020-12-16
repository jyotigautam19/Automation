package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import demo.demoLogin;
import io.cucumber.java.en.*;

public class loginPOM{
	
	
	WebDriver driver = null;
	demoLogin dl=null;
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		driver = new ChromeDriver();
	    driver.get("https://example.testproject.io/web/");
	}

	@When("^the user enters (.*) and (.*)$")
	public void the_user_enters_valid_crententials(String username, String password) {
		
		dl=new demoLogin(driver);
        dl.enterUsername(username);
        dl.enterPassword(password);
      

	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
				dl.clickLogin();
	}
	


	@Then("the user is navigated to the home page")
	public void the_user_is_navigated_to_the_home_page() {
		
		dl.checkDisplayLogout();
		
	}
	}
	

