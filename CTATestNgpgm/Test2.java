package CTATestNgpgm;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {
//	@Test(priority=1)
//	@Test(enabled=true)
//	@Test(invocationCount = 3)
	@Test(dependsOnMethods = {"cityfunction"},alwaysRun=true)
	public void GoogleFunction() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://www.google.com");
	
	}
	@Test
//	@Test(priority=2)
//	@Test(enabled = false)
//	@Test(description = "citifunction runs the city url")
	public void cityfunction() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://www.online.citibank.co.in/");
	}

}
