package testNGBasics;

import org.testng.Assert;
import org.testng.asserts.*;
import org.testng.annotations.Test;

public class AssertionsDemo {

  @Test(enabled=false)
  public void test_method1()
  {
    System.out.println("Test method 1");
    Assert.assertEquals(true, false);
    System.out.println("Test method after assert");
    
  }
  
  @Test(enabled=true)
  public void test_method2()
  {
    System.out.println("Test method 2");
    SoftAssert softassert = new SoftAssert();
    softassert.assertEquals(true, false);
    System.out.println("Test method after soft assert");
    softassert.assertAll();
    
  }
}