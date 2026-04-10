package CTATestNgpgm;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class Test4Group {

	
	WebDriver driver;
	@Parameters({"username","password"})
  @Test(groups="Nitin")
  public void a(String username,String password) throws InterruptedException {
	  System.out.println("actual test function f() is executed!");
	  System.out.println("username: "+username);
	  System.out.println("password: "+password);
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  Thread.sleep(5000);
	  driver.findElement(By.name("username")).sendKeys(username);
	  driver.findElement(By.name("password")).sendKeys(password);	  
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method is executed!!");
//	  Reporter.log("wellcome to log");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method is executed!!");
  }

}

