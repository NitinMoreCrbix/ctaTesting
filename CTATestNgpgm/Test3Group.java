package CTATestNgpgm;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test3Group {
			
	WebDriver driver;

	@Test(groups = "Shweta")
	public void f() {
		System.out.println("Actual Test functional executed");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		
		driver.get("https://www.online.citibank.co.in/");
	}

	@Test(groups="RegressionTest")
	public void f1() {
		System.out.println("function2 executed facebook.com");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		
		driver.get("https://www.facebook.com/");
	}
	@Test(groups="Nitin")
	public void f2() {
		System.out.println("function3 executed");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		
		driver.get("https://www.rediff.com/");
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method executed");
		
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method executed");
	}
}

