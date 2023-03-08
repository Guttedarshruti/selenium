package doubleclick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {

	public static void main(String[] args) 
	{

		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		 Actions act = new Actions(driver);
		 
		WebElement san = driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement bmh = driver.findElement(By.xpath("//div[@id='box106']"));
		
		act.dragAndDrop(san, bmh).perform();

	}

}
