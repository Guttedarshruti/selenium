package seleniumbegins;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class browsers {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//div[@id='9D-DRcS2YJvllumbuyv8eA']//a[@class='a-link-normal see-more truncate-1line'][normalize-space()='See more']")).click();
		
		driver.findElement(By.xpath("//div[@class='a-cardui-footer']//a[1]")).click();
	}

}
