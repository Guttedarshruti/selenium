package seleniumbegins;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class impicitwait {


	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebDriverWait sat = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("manager");
		
		driver.switchTo().alert();
		
		
	

	}

}
