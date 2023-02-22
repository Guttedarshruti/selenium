package seleniumbegins;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class orange {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		String act_title = driver.getTitle();
		String exp_title = "OrangeHRM";
		
		if(act_title.equals(exp_title))
		{
		System.out.println("test cae pass");
		}
		else
		{
			System.out.println("test cae fail");
			
		}
		String act_lable = driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		String exp_label = "Dashboard";
		
		
		Object act_label = null;
		if(act_label.equals(exp_label))
		{
			System.out.println("test cae pass");
		}
		else
		{
			System.out.println("test cae fail");
		}
		}
	
	}


