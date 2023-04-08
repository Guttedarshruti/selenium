package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignmenttestng 
{
	WebDriver driver;
  @BeforeMethod
  public void openapp()
  {  
	  driver = new FirefoxDriver();		
		driver.get("https://recruit.talview.com/login");
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
  }
@Test

void login()
{
	driver.findElement(By.xpath("//input[@id='identification']")).sendKeys("shruti.g+488@talview.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Kshatriya#123");
	driver.findElement(By.xpath("//*[@id=\"ember72\"]/div/div[2]/div/form/div[4]/button")).click();
}
		
  }
