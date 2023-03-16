package Testng35;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class class2 {
  @Test
  public void logout() 
  {
	  System.out.println("from class 2");
  }
  @AfterMethod()
  void n()
  {
	  System.out.println("test");
  }
  @AfterSuite()
  void As()
  {
	  System.out.println("aftersuit");
  }
  }

