package seleniumbegins;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath
{

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.findElement(By.xpath("//input[@name='search']"));
		
		
		//multiple attribute using and operator
		driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("laptop");
		
		
		//multiple attribute using or operator
		driver.findElement(By.xpath("//input[@name='search' or @placeholder='xyz']")).sendKeys("hii");
		
		//preceding
		driver.findElement(By.xpath("//input[@name='search']/parent::from"));
		
		

	}

}
