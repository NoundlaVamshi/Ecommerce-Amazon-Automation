package amazon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class login {
  @Test
  public void f() throws InterruptedException, IOException {
	  // Checking the login Functionality
	  // Checking the new address functionality
	  //Open the URL, Maximazie the  window 
	  // clicking on login button 
	  // user enter the valid credintials like user and password
	  // clicking on sign button
	  // user want to  save the address 
	  // By enter all input data
	  // clicking on save address
	  // screenshot should be done after saving the address 
	  
	  
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 Thread.sleep(1000); 	 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //System.out.println("launchApplication method is ");
   
	  
	  driver.findElement(By.className("nav-line-1-container")).click();
		driver.findElement(By.id("ap_email")).sendKeys("9603929730");
		driver.findElement(By.className("a-button-input")).click();
		driver.findElement(By.name("password")).sendKeys("Vamshi@123");
		driver.findElement(By.className("a-button-input")).click();
		driver.findElement(By.className("nav-line-1-container")).click();
		driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[1]/div/div[3]/div[1]/a/div/div/div/div[2]/h2")).click();
		driver.findElement(By.id("ya-myab-plus-address-icon")).click();
		
		driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber")).sendKeys("9603929730");
		driver.findElement(By.id("address-ui-widgets-enterAddressFullName")).sendKeys("Vamshi");
		driver.findElement(By.id("address-ui-widgets-enterAddressLine1")).sendKeys("Sai Sadan Boys Hostel");
		driver.findElement(By.id("address-ui-widgets-enterAddressLine2")).sendKeys("Ongole");
		driver.findElement(By.id("address-ui-widgets-landmark")).sendKeys("Dmart");
		driver.findElement(By.id("address-ui-widgets-enterAddressCity")).sendKeys("Ongole");
		driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-form-submit-button\"]/span/input")).click();
		
		 
		
		File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 Files.copy(f, new File("C:\\Users\\nound\\OneDrive\\Desktop\\screenshot\\amazonscreenshot.jpg"));
		System.out.println("Screenshot method is executed");
		
		
		
  }
	
}

