package seleniumbegins;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Excplicitlywait 
{

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement set = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@input='username']")));
		set.sendKeys("manager");
	}

}
