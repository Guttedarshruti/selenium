package seleniumbegins;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		/*driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("12/09/2022");
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).clear();
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("12/09/2023");*/
		
	  	  String year="2025";
	  	  String month="April";
	  	  String Date="25";
	  	  
	  	  driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	  	  
	  	  while(true)
	  	  {
	  		  String mon = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]")).getText();
	  		  
	  		 String yr = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	  		 
	  		 if(mon.equals(month) && yr.equals(year))
	  		 {
	  			 break;
	  		 }
	  		 
	  		 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	  	  }
	  	  
			
		}
		
		
		
		
	
	

	}


