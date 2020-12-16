//Test Case 3 - Verify error messages for mandatory fields.
//
//Steps to Automate:
//1. Open this url  http://automationpractice.com/index.php
//2. Click on sign in link.
//3. Enter email address and click Register button.
//4. Leave the mandatory fields (marked with *) blank and click Register button.
//5. Verify that error has been displayed for the mandatory fields.

package onlineAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCaseFive {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.className("login")).click();	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("email_create")).sendKeys("test999@test.com");
		driver.findElement(By.id("SubmitCreate")).click();
		
		//driver.findElement(By.id("customer_firstname")).sendKeys("");
		//driver.findElement(By.id("customer_lastname")).sendKeys("");
		
		driver.findElement(By.id("submitAccount")).click();
		
		if
		
		(driver.findElement(By.id("authentication")).getText().contains("There are 8 errors"))

		
		{
			System.out.println("error messages verified");
		}
		
		driver.close();
		
		driver.quit();
		
	}

}
