package seleniumbegins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalcammands {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println(status);
		boolean ps = driver.findElement(By.xpath("//input[@name='FirstName']")).isDisplayed();
		System.out.println(ps);
		 boolean disp = driver.findElement(By.xpath("//input[@name='FirstName']")).isEnabled();
		 System.out.println(disp);
		 boolean sel = driver.findElement(By.xpath("//input[@name='Gender']")).isSelected();
		 System.out.println(sel);
	}

}


