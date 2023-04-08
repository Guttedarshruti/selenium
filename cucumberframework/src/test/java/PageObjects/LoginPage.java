package PageObjects;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class LoginPage 
	{
		public WebDriver driver;
		
		public LoginPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath="//input[@id='Email']")
		WebElement uname_txt;
		
		@FindBy(xpath="//input[@id='Password']")
		WebElement pwd_txt;
		
		@FindBy(xpath="//button[@type='submit']")
		WebElement login_btn;
		
		
		public void set_Username(String username)
		{
			uname_txt.clear();
			uname_txt.sendKeys(username);
		}
		
		public void set_Password(String password)
		{
			pwd_txt.clear();
			pwd_txt.sendKeys(password);
		}
		
		public void click_Login()
		{
			login_btn.click();
		}

	}


