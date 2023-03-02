package seleniumbegins;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class popups {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();

	}

}
