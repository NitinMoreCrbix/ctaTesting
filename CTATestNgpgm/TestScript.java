package CTATestNgpgm;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://demoqa.com/alerts");
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		//read site title string
		String readstr = (String)js.executeScript("return document.Title");
				
		System.out.println("readstr= "+readstr);
		
		
		//Enter text into HTML TB
		js.executeScript("document.getElementById('textbox').Value='Nitin More';");
		
		
		//scroll down the page till the element is found
//		JavascriptExecutor js = (JavaScriptExecutor) driver;
//		WebElement element = driver.findElement(By.linkText("create"));
//		js.executeScript("argument[0].scrollIntoView();", element);
		
		
		
		//---------------scroll by parameter by giving pixel--------//
		
		/*JavascriptExecutor js = (JavaScriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-350)", "");//scroll up
		js.executeScript("window.ScrollBy(0,350)", "");// scroll down*/
		
		//--------------hidden element ----------------------------//
		/*WebElement element = driver.findElement(By.partialLinkText("plastic spiral bind"));
		JavascriptExecutor js = (JavaScriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);*/
		
		
		
	}


}
