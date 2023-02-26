package seleniumbegins;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("dell");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("laptop");
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("hp");

	}

}
