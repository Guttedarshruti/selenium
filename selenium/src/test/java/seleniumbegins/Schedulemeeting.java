package seleniumbegins;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Schedulemeeting {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
				
		driver.get("https://recruit.talview.com/login");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='identification']")).sendKeys("shruti.g+488@talview.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Kshatriya#123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		Thread.sleep(3000);
		 driver.findElement(By.linkText("Candidates")).click();
		Thread.sleep(5000);
		/*
		driver.findElement(By.xpath("//a[@id='ember134']")).click();
		driver.findElement(By.xpath("//div[@id='ember584']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='ui large basic button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='ember-power-select-placeholder']")).click();
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//div[@class='ember-power-select-search']")).click();
			*/
		
	
	 
		
	   driver.findElement(By.xpath("//input[@placeholder='Search Candidates' and @type='text']")).sendKeys("Shrutiiiii Guttedar"
	   		+ "");
	   Thread.sleep(5000);
	  
	   System.out.println("Search candidate name");
	   driver.findElement(By.xpath("//i[@class='search icon cursor-pointer cursor-pointer-events-all']")).click();
	   Thread.sleep(5000);
	   System.out.println("SClick on search icon");
	   Thread.sleep(10000);
	   WebElement m = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/label[1]"));
	   JavascriptExecutor jse = (JavascriptExecutor) driver;
	   jse.executeScript("arguments[0].click();", m);
	   Thread.sleep(30000);
	   driver.findElement(By.xpath("//div[1]/div[@data-tooltip='Invite to Assessment']")).click();
	  
	   Thread.sleep(3000);
	   driver.findElement(By.xpath(" //span[contains(text(),'Select for assessment')]")).click();
	   System.out.println("assessment is clicked");
	  
	   Thread.sleep(50000);
	   driver.findElement(By.xpath("//div[@class='ember-power-select-search']")).click();
	  
	   System.out.println("assessment is searched");
	   Thread.sleep(10000);
	 // driver.findElement(By.xpath("//div[@class='ember-power-select-search']")).sendKeys("asdjkahdskj");
	   WebElement serchassesment =driver.findElement(By.xpath("//div[1]/input[@class='ember-power-select-search-input' or @type='search']")); //.sendKeys("Hjkjasjajs");
	   Thread.sleep(10000);
//
serchassesment.sendKeys("testing");
serchassesment.click();
		
		
		
	}

}

