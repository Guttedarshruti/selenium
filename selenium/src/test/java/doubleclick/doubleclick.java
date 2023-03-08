package doubleclick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//input[@id='field1']")).clear();
		
		driver.findElement(By.xpath("//input[@id='field1']")).sendKeys("ram");
		
		WebElement dsc = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(dsc).perform();
		
		WebElement ref = driver.findElement(By.xpath("//input[@id='field2']"));
		
		String copy = ref.getAttribute("value");
		
		System.out.println(copy);
		
		
	}

}
