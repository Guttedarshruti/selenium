package Testng;

import org.testng.annotations.Test;

public class example1 
{
  @Test(priority=2)
  public void f() 
  {
	  System.out.println("stoty");
  }
  @Test(priority=1)
  void disp()
  {
	  System.out.println("jon");
	  
  }
  @Test(priority=0)
  void admin()
  {
	 System.out.println("mon"); 
  }
}
