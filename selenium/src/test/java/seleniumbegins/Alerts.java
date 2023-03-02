package seleniumbegins;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium");
		Thread.sleep(2000);
		
		List<WebElement> sum = driver.findElements(By.xpath("//div[contains(@class, 'wM6W7d')]//span"));
		System.out.println("print the size:"+sum.size());
		
		for(int i=0; i<sum.size();i++)
		{
			sum.get(i).getText();
		}
		
		

	}

}
