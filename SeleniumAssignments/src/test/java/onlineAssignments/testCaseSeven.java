//Test Case 1 - Automate End to End Buy Order functionality.
//
//Steps to Automate:
//1. Open link http://automationpractice.com/index.php
//2. Login to the website.
//3. Move your cursor over Women's link.
//4. Click on sub menu 'T-shirts'.
//5. Mouse hover on the second product displayed.
//6. 'More' button will be displayed, click on 'More' button.
//7. Increase quantity to 2.
//8. Select size 'L'
//9. Select color.
//10. Click 'Add to Cart' button.
//11. Click 'Proceed to checkout' button.
//12. Complete the buy order process till payment.
//13. Make sure that the Product is ordered.

package onlineAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class testCaseSeven {
	
	
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		WebElement category,type,size;
		driver.manage().window().maximize();	
	    driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		category=driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
		type=driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a"));
		
	      Actions action = new Actions(driver);
		  action.moveToElement(category).perform();
		  action.moveToElement(type).click().perform();
		
		  
		  action.moveToElement(driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div"))).perform();
		  action.moveToElement(driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]"))).click().perform();;
		
		  driver.findElement(By.className("icon-plus")).click();
		  
		 size = driver.findElement(By.id("group_1"));
		 Select sel=new Select(size);
		 
		 sel.selectByIndex(1);
		 
		  
		  driver.findElement(By.xpath("//*[@id=\"color_14\"]")).click();
		  
		  
		  //add to cart
		  driver.findElement(By.name("Submit")).click();
		  
		  //proceed to chkout
		  driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")).click();
		  
		
		  //proceed to chkout
		  driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();
		  
		 // sign-in
		  driver.findElement(By.id("email")).sendKeys("test665@test.com");
		  driver.findElement(By.id("passwd")).sendKeys("NewPass1!");
		  driver.findElement(By.id("SubmitLogin")).click();
		  
		  //Address Proceed to checkout
		  driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button")).click();
		  
		
		  driver.findElement(By.id("cgv")).click();
		  driver.findElement(By.xpath("//*[@id=\"form\"]/p/button")).click();
		  
		  driver.findElement(By.className("cheque")).click();
		  
		  //confirm order
		  driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button")).click();
		  
		  
		  if(
		  driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[1]")).getText().contains("Your order on My Store is complete."))
			  
		  {
			  System.out.println("success");
		  }
		  
		  
		
		  driver.close();
		  driver.quit();
		  
		 
	}
	}


