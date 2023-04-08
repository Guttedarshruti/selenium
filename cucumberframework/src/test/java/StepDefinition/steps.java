package StepDefinition;


import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObjects.HomePage;
import PageObjects.LoginPage;

public class steps
{
	WebDriver driver;
	LoginPage lp;
	HomePage hp;
	Logger logger; //for logging
	ResourceBundle rb; // for reading properties file
	String br; //to store browser name
	
	
	@Before
    public void setup()    //Junit hook - executes once before starting
    {
        //for logging
        logger= LogManager.getLogger(this.getClass());
        //Reading config.properties (for browser)
        rb=ResourceBundle.getBundle("config");
        br=rb.getString("browser");
     
    }
	
	@Given("Launch browser")
	public void launch_browser() 
	{
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(option);
	}

	@Given("open url {string}")
	public void open_url(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
	}

	@When("user enters Username as {string}")
	public void user_enters_username_as(String username) 
	{
		lp=new LoginPage(driver);
		lp.set_Username(username);
	}

	@When("enters Password as {string}")
	public void enters_password_as(String password) 
	{
		lp=new LoginPage(driver);
		lp.set_Password(password);
	}

	@When("clicks on Login button")
	public void clicks_on_login_button() 
	{
		lp=new LoginPage(driver);
		lp.click_Login();
	}

	@Then("User navigates to Home page")
	public void user_navigates_to_home_page() 
	{
	    hp= new HomePage(driver);
	    hp.Logout_btn.isEnabled();
	}

}



