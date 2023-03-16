package Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class methods 
{
	@BeforeMethod
	void login()
	{
		System.out.println("login");
	}
	
	@Test(priority=0)
	void search()
	{
		System.out.println("search");
	}
	
  @Test(priority=2)
  public void multi()
  {
	  System.out.println("multi");
	  
  }
  
  @AfterMethod
  void logout()
  {
	  System.out.println("logout");
  }
  }
  
  

