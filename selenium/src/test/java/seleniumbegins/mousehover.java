package seleniumbegins;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {

	public static void main(String[] args) 
	{
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		WebElement var = driver.findElement(By.xpath("//div[contains(text(),'Fashion')]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(var).click().perform();
		
		
		
	}

}
