package seleniumbegins;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxes {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='thursday']")).click();
		
		List<WebElement> div = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println("total no of checkboxes:"+div.size());
		
		for(int i=0; i<div.size();i++)
		{
			div.get(i).click();
		}
		for(WebElement set:div)
		{
			set.click();
		}
	}

}
