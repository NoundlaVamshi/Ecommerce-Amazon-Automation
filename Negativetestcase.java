package amazon;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Negativetestcase {
  @Test
  public void f() throws InterruptedException, IOException {
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 Thread.sleep(1000); 	 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //System.out.println("launchApplication method is ");
   
	  
	  driver.findElement(By.className("nav-line-1-container")).click();
		driver.findElement(By.id("ap_email")).sendKeys("     ");
		driver.findElement(By.className("a-button-input")).click();
		
		File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 Files.copy(f, new File("C:\\Users\\nound\\OneDrive\\Desktop\\screenshot\\amazonscreenshot.jpg"));
		System.out.println("Screenshot method is executed");
		
		
		
		
		//driver.findElement(By.name("password")).sendKeys("Vamshi@123");
		//driver.findElement(By.className("a-button-input")).click();
	  
  }
}
