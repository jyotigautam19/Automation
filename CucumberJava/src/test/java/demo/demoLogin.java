package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class demoLogin {
	
	WebDriver driver=null;
	
	  private By txt_name = By.id("name");
	  private By txt_password = By.id("password");
	  private By btn_login = By.id("Login");
	  
	  private By btn_logout= By.id("logout");
	  
	   
	   public demoLogin(WebDriver driver)
	   
	   {
		   
		   this.driver=driver;
	   }
	   
	   
	   public void enterUsername(String username)
	   {
		   
		   driver.findElement(txt_name).sendKeys(username);	
	   }
	   
	   
	   public void enterPassword(String pass)
	   {
		   
		   driver.findElement(txt_password).sendKeys(pass);	
	   }
	   
	   public void clickLogin()
	   {
		   driver.findElement(btn_login).click(); 
	   }
	   
	   public void checkDisplayLogout()
	   {
		   driver.findElement(btn_logout).isDisplayed();
	   }
	   }
	   

