package Selenium.Auto;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;

public class FirstTest {
	
	WebDriver driver;
	
 
  @BeforeSuite
  public void beforeSuite() 
   {
  
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  
  }
  
  
  
  @Test
  public void ClickLogin()
  {
  
	  driver.get("https://www.payumoney.com/");
	  driver.findElement(By.cssSelector(".grey_btn.right.new_login.ng-isolate-scope")).click();
	  
	  driver.findElement(By.id("userEmail")).sendKeys("9632211133");
	  driver.findElement(By.name("userPassword")).sendKeys("visu@123");
	  driver.findElement(By.cssSelector(".blue_btn.OpenSansSemibold")).click();
	  
	  
	  
	   
  }
  
  
  

  @AfterSuite
  public void afterSuite() 
  {
  
	//  driver.quit();
	  
  }

}
