package CTATestNgpgm;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Testngpgm {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  
  }
  @Test
  public void ABC() {
	  System.out.println("abc method is executed");
  }
  
  @Test
  public void XYZ() {
	  System.out.println("xyz method is executed");
  }
  
  @Test
  public void MNN() {
	  System.out.println("MNN method is executed");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method is executed");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method is executed");
  }

 
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class is executed");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class is delivered");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test is executed");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test is executed");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before suite is executed");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suite is executed");
  }

}
