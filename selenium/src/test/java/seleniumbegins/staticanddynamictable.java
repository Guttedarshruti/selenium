package seleniumbegins;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class staticanddynamictable {

	private static Object author;

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//table[@name='BookTable']"));
		
		int size = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("total number of rows:"+ size);
		
		int col = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("total number of coloums:"+ col);
		
		
		
		System.out.println("Book Nmae"+"    "+"Author"+"   "+"Subject"+"    "+"price");
		
		/*for(int r=2; r<size; r++)
		{
			for(int c=1; c<col; c++)
			{
		String find = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();	
		System.out.print(find+"\t");
			}
System.out.println();

			}*/
			for(int r=2; r<size; r++)
					{
				String str = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
				
				if(str.equals("Mukesh"))
				{
					String scr = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
					
					System.out.println(scr);
				}
				
				
				
				}
				
		}
}




	

		




