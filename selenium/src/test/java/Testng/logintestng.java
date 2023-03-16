package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class logintestng 
{
	
	WebDriver driver;
  @Test(priority=0)
  public void login()
  {
	  driver = new FirefoxDriver();
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  driver.get("https://www.meesho.com/");
	  
  }
  
  @Test(priority=1)
  void action()
  {
	  driver.findElement(By.xpath("//input[@placeholder='Try Saree, Kurti or Search by Product Code']")).sendKeys("tshirt");
  }
  @Test(priority=2)
  void close()
  {
	driver.close();  
  }
  }
  
  

