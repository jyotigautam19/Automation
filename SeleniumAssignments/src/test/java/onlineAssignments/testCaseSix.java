//Steps to Automate:
//1. Open this url  http://automationpractice.com/index.php
//2. Click on sign in link.
//3. Enter email address and click Register button.
//4. Enter incorrect values in fields like., enter numbers in first and last name, city field etc and enter alphabets in Mobile no, Zip postal code etc., and click on 'Register' button.
//5. Verify that error messages fpr respective fields are displaying.

package onlineAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class testCaseSix {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.className("login")).click();	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("email_create")).sendKeys("test999@test.com");
		driver.findElement(By.id("SubmitCreate")).click();
		
		driver.findElement(By.id("customer_firstname")).sendKeys("1234");
		driver.findElement(By.id("customer_lastname")).sendKeys("5678");
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("test999@test.com");
		driver.findElement(By.id("passwd")).sendKeys("NewPa");
		driver.findElement(By.id("firstname")).sendKeys("1234");
		driver.findElement(By.id("lastname")).sendKeys("5678");
		driver.findElement(By.id("address1")).sendKeys("1hj");
		driver.findElement(By.id("city")).sendKeys("987");
		
		WebElement statename=driver.findElement(By.id("id_state"));
		
		Select state = new Select(statename);
		//state.selectByIndex(2);
		state.selectByVisibleText("Alaska");
		
		driver.findElement(By.id("postcode")).sendKeys("uuu");
	
		Select country =new Select(driver.findElement(By.id("id_country")));
		country.selectByVisibleText("United States");
		driver.findElement(By.id("phone_mobile")).sendKeys("aaa");
		driver.findElement(By.id("alias")).clear();
		driver.findElement(By.id("alias")).sendKeys("alias");
		Thread.sleep(5000);
		driver.findElement(By.id("submitAccount")).click();
		
		if(driver.findElement(By.id("authentication")).getText().contains("lastname is invalid"))
{
	    System.out.println("lasname error message correct");
}
		
if(driver.findElement(By.id("authentication")).getText().contains("firstname is invalid"))
{
    System.out.println("firstname  error message correct");
}
if(driver.findElement(By.id("authentication")).getText().contains("phone_mobile is invalid"))
{
    System.out.println("mobile phone error message correct");
}
if(driver.findElement(By.id("authentication")).getText().contains("The Zip/Postal code you've entered is invalid. It must follow this format: 00000"))
{
    System.out.println("postal code error message correct");
}
		
	
		
		driver.close();
		driver.quit();
		
		
	}

}
