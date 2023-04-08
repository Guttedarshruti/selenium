package seleniumbegins;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class automationassignment {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
				
		driver.get("https://recruit.talview.com/login");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='identification']")).sendKeys("shruti.g+488@talview.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Kshatriya#123");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"ember72\"]/div/div[2]/div/form/div[4]/button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@id='ember134']")).click();
		Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@data-tooltip='Create Candidate']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("shrutiiiii");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id='middle_name']")).sendKeys("s");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("guttedar");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shruti.g+test38@talview.com");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("2468325612");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id='ember260']")).click();
    		
	}

}
