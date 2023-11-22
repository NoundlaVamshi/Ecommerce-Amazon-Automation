package amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Testlist.class)



public class gettitle  {
	static WebDriver driver;

@Test
  public void setup() 
  {
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
  
	String actualTitle = driver.getTitle();
	String exceptedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	Assert.assertEquals( actualTitle, exceptedTitle);
  
  boolean flag = driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]")).isDisplayed();
  Assert.assertTrue(flag);
  
	
  
	  driver.quit();    
  }
	
  }

