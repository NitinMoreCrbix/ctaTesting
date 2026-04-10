package CTATestNgpgm;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestingFlag {
//  @Test(priority=1)
//  @Test(enabled=false)
//	@Test(invocationCount=3)
  @Test
  public void Google() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	  driver.get("https://www.google.com/");
  }
//  @Test(priority=2)
  @Test(description="runs the facebook social media")
  public void Facebook() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	  driver.get("https://www.facebook.com/");
  }
//  @Test(priority=3)
  @Test(dependsOnMethods= {"Google"},alwaysRun=true)
  public void Amazon() {
	  WebDriver driver1 = new ChromeDriver();
	  driver1.manage().window().maximize();
	  driver1.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	  driver1.get("https://www.amazon.com/");
		  
	  }
  }

