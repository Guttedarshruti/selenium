package Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class beforeclass 
{
	@BeforeClass
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
  
  @AfterClass
  void logout()
  {
	  System.out.println("logout");
  }
  }
  
  

 

