package seleniumbegins;

import org.openqa.selenium.chrome.ChromeDriver;

public class naviagations {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.meesho.com/");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.Ajio.com/");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
		
		

	}

}
