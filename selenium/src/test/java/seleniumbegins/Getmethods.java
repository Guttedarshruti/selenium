package seleniumbegins;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethods {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println("title of the current page:"+ driver.getTitle());
		System.out.println("title of the current url:"+ driver.getCurrentUrl());
		System.out.println("title of the current page source:"+ driver.getPageSource());
		System.out.println( driver.getWindowHandle());
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> win = driver.getWindowHandles();
	
		
		}

	}


