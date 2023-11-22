package amazon;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.google.common.io.Files;
@Listeners(Testlist.class)
public class Screenshot {
	
  @Test
  public void f () throws InterruptedException, IOException {
	  ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		System.out.println("launchApplication method is executed"); 
		 Thread.sleep(1000);
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("dell laptop" + Keys.ENTER);
	  System.out.println("searchbox method is executed");
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,300)", "");
		 WebElement Product = driver.findElement(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
			Product.click();
			Set<String> windowHandles = driver.getWindowHandles();
			for (String windowHandle : windowHandles) {
		          driver.switchTo().window(windowHandle);
			
			}
			
		 File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 Files.copy(f, new File("C:\\Users\\nound\\OneDrive\\Desktop\\screenshot\\amazonscreenshot.jpg"));
		System.out.println("Screenshot method is executed");
		
  }
  
}
