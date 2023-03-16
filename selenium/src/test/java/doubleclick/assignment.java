package doubleclick;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class assignment {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement pass = driver.findElement(By.xpath("//a[normalize-space()='SALES']"));
		WebElement hold = driver.findElement(By.xpath("//ol[@id='loan']//li[@class='placeholder']"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(pass, hold).perform();
		

	}

}
