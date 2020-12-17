//Test Case 3 - Automate User Registration Process
//
//Steps to Automate:
//1. Open this url  http://automationpractice.com/index.php
//2. Click on sign in link.
//3. Enter your email address in 'Create and account' section.
//4. Click on Create an Account button.
//5. Enter your Personal Information, Address and Contact info.
//6. Click on Register button.
//7. Validate that user is created.

package onlineAssignments;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCaseThree {
	
	public static void main(String[] args) throws InterruptedException

	
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.className("login")).click();		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	
	      
		Random rand = new Random(); //instance of random class
	      int upperbound = 25;
	        //generate random values from 0-24
	      int int_random = rand.nextInt(upperbound); 
	      
	      System.out.println("random no is"+ int_random);
		
		driver.findElement(By.id("email_create")).sendKeys("test66"+ int_random + "@test.com");
		driver.findElement(By.id("SubmitCreate")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[1]/div[2]/label")).isSelected();
		driver.findElement(By.id("customer_firstname")).sendKeys("fname");
		driver.findElement(By.id("customer_lastname")).sendKeys("lname");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("test66"+ int_random + "@test.com");
		driver.findElement(By.id("passwd")).sendKeys("NewPass1!");
		driver.findElement(By.id("firstname")).sendKeys("fname");
		driver.findElement(By.id("lastname")).sendKeys("lname");
		driver.findElement(By.id("address1")).sendKeys("123 fake address");
		driver.findElement(By.id("city")).sendKeys("leeds");
		
		WebElement statename=driver.findElement(By.id("id_state"));
		
		Select state = new Select(statename);
		//state.selectByIndex(2);
		state.selectByVisibleText("Alaska");
		
		driver.findElement(By.id("postcode")).sendKeys("00000");
	
		Select country =new Select(driver.findElement(By.id("id_country")));
		country.selectByVisibleText("United States");
		driver.findElement(By.id("phone_mobile")).sendKeys("11111111111");
		driver.findElement(By.id("alias")).clear();
		driver.findElement(By.id("alias")).sendKeys("alias");
		Thread.sleep(5000);
		driver.findElement(By.id("submitAccount")).click();
		
		if(driver.findElement(By.className("nav")).getText().contains("fname"))
		{
			System.out.println("User is successfully logged in");
			
		}
		else
			
		{
			System.out.println("Incorrect page");
		}
		driver.close();
		driver.quit();	
		
	}


	
	}


