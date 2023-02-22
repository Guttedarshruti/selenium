package seleniumbegins;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartlocators {

	private static final By By = null;

	public static void main(String[] args) throws InterruptedException
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("tshirts");
		Thread.sleep(2000);
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("total number of images:"+images.size());
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("total number of links:"+links.size());
		
	}

	
	}


