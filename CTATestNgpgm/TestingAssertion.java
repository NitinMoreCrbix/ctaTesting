package CTATestNgpgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestingAssertion {
@Test
public void run()
{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
//		Assert.assertEquals(driver.getTitle(), "facebook");
//		Reporter.log("login page is displayed,pass",true);
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(), "facebook");
		driver.findElement(By.id("username")).sendKeys("Nitin");
  }
}
