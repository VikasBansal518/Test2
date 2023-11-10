package testNGBasics;

import org.testng.annotations.Test;

public class GroupsExample1 {

  @Test(groups = { "group1", "group2" })
  public void test_method1()
  {
    System.out.println("Test method 1");
  }
 
  @Test(groups = {"group2"} )
  public void test_method2()
  {
	  System.out.println("Test method 2");
  }
 
  @Test(groups = {"group1", "group3"})
  public void test_method3()
  {
	  System.out.println("Test method 3");
  }
}