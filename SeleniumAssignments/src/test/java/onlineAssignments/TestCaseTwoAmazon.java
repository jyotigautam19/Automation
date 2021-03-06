//1. Launch browser of your choice say., firefox, chrome etc.
//2. Open this URL -  www.amazon.in
//3. Maximize or set size of browser window.
//4. Get the page title and print it.
//5. Click on first menu link, say 'Amazon Pay'.
//6. Get Page title and verify it with expected value.
//7. Navigate back to Home Page. 
//8. Get Page title and verify it with expected value.
//9. Repeat steps 5 to 8 for other menu links.
//10. Close the browser.

package onlineAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class TestCaseTwoAmazon {
	
	
	static WebDriver driver ;
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		String title1,title2,title3;
		String expectedTitle1, actualTitle1,expectedTitle2, actualTitle2;
		
		driver = new ChromeDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
		title1=driver.getTitle();
		System.out.println("Title1 = " +title1);
		driver.findElement(By.linkText("Gift Cards")).click();
		expectedTitle1 = driver.getTitle();
		System.out.println("Expected Title1 = " +expectedTitle1);
		actualTitle1 = "Gift Cards & Vouchers Online : Buy Gift Vouchers & E Gift Cards Online in India - Amazon.in";
		System.out.println("Actual Title1 = " +actualTitle1);
	    Assert.assertEquals(expectedTitle1, actualTitle1);
	    driver.navigate().back();
	    title2=driver.getTitle();
	    System.out.println("title 2 = " + title2);
	    Assert.assertEquals(title1,title2);
	    driver.findElement(By.linkText("Best Sellers")).click();
		expectedTitle2 = driver.getTitle();
		System.out.println("Expected Title2 = " +expectedTitle2);
		actualTitle2 = "Amazon.in Bestsellers: The most popular items on Amazon";
		System.out.println("Actual Title2 = " +actualTitle2);
	    Assert.assertEquals(expectedTitle2, actualTitle2);
	    driver.navigate().back();
	    title3=driver.getTitle();
	    Assert.assertEquals(title2,title3);
	    
	    driver.close();
	    driver.quit();
	
	
	}

}
