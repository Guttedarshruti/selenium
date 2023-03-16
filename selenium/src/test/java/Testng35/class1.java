package Testng35;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class class1 
{
  @Test
  public void login() 
  {
	  System.out.println("form class 1");
  }
  @BeforeMethod()
  void m()
  {
	  System.out.println("test");
  }
  @BeforeSuite()
  void bs()
  {
	  System.out.println("method");
  }
  }

