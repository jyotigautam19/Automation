//package StepDefinitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import junit.framework.Assert;
//
//public class login {
//	
//	
//	WebDriver driver = null;
//	
//	@Given("the user is on the login page")
//	public void the_user_is_on_the_login_page() {
//		driver = new ChromeDriver();
//	    driver.get("https://example.testproject.io/web/");
//	}
//
//	@When("^the user enters (.*) and (.*)$")
//	public void the_user_enters_valid_crententials(String username, String password) {
//        driver.findElement(By.id("name")).sendKeys(username);	
//       
//       driver.findElement(By.id("password")).sendKeys(password);
//
//	}
//
//	@And("clicks on login button")
//	public void clicks_on_login_button() {
//		 driver.findElement(By.id("Login")).click();;
//	}
//	
//
//	@SuppressWarnings("deprecation")
//	@Then("the user is navigated to the home page")
//	public void the_user_is_navigated_to_the_home_page() {
//		
//		driver.findElement(By.id("logout")).isDisplayed();
//		
//		
//	}
//	}
//	
//
