package seleniumbegins;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args)
	{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://itera-qa.azurewebsites.net/home/automation");
	driver.manage().window().maximize();
	
	WebElement admin = driver.findElement(By.xpath("//select[@class='custom-select']"));
	Select country = new Select(admin);
	
	country.selectByVisibleText("Malta");
	country.selectByIndex(3);
	country.selectByValue("2");

	List<WebElement> princi = country.getOptions();
	System.out.println("total no of options:"+princi.size());
	
	for(int i=0; i<princi.size();i++)
	{
		System.out.println(princi.get(i).getText());
		
		
		
			}
	

	
	
	}

}
