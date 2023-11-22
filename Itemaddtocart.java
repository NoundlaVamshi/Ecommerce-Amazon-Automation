package amazon;

import java.io.File;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.io.Files;
@Listeners(Testlist.class)






public class Itemaddtocart {
	
	
  @Test
  public void f() throws InterruptedException, IOException {
	  
	  ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		// Maximazie the  window 
		 driver.manage().window().maximize();
		 //It will clear the Exception using Thread command
		 Thread.sleep(1000);
		 // User want to search the product in search option
		 Scanner obj = new Scanner (System.in);	 			
		 System.out.println("What do you want to search");
		 String a = obj.nextLine();
		 Thread.sleep(3000);
		// enter the product and click on search button
		 WebElement searchbox =driver.findElement(By.id("twotabsearchtextbox"));
		 searchbox.sendKeys(a);	
		WebElement searchbutton = driver.findElement(By.id("nav-search-submit-button"));
		searchbutton.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,300)", "");	
		  // user find the required product click on the product
		WebElement Product = driver.findElement(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
		Product.click();
		// By clicking on product it should navigate to next tab
		
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
	          driver.switchTo().window(windowHandle);
	          if (driver.getTitle().contains("Apple iPhone 15")) {
	        	  System.out.println("Title of the new window: " + driver.getTitle());
	        	  JavascriptExecutor js1 = (JavascriptExecutor) driver;
	     		 js1.executeScript("window.scrollBy(0,300)", "");	
	     		 WebElement addtocart = driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]"));
	     		 addtocart.click();
	     		//WebElement cart = driver.findElement(By.xpath("//input[@id=\"attach-sidesheet-view-cart-button\"]/span/input"));
	     		 //cart.click();
	     		 
	     		WebDriverWait GotoCart_Wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	            WebElement GotoCart = GotoCart_Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id=\"attach-sidesheet-view-cart-button-announce\"]")));

	            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", GotoCart);

	            Actions actions = new Actions(driver);
	            actions.moveToElement(GotoCart).click().perform();
	            
	            Thread.sleep(20000);
	     		
	     		
	          }
		
		}
  }
  
  
  
  }
	

      
  
  
  
  
  
  

