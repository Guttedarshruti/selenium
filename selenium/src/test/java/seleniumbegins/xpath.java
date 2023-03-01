package seleniumbegins;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("laptop");

	}

}
