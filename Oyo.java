package Oyo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import amazon.Testlist;
@Listeners(Testlist.class)
public class Oyo {
  @Test
  public void f() throws InterruptedException {
	  ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.oyorooms.com/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);// created a object of action class
		WebElement target = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[2]/div/div[3]/a/div/h2"));
		act.moveToElement(target);
		WebElement target2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[2]/div/div[3]/div/a[5]"));
		act.moveToElement(target2).click().build().perform();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/aside/div[2]/div[2]/div/div/label[1]/div")).click();
		
		
  }
}	
   
  
  
  
  
  
  

