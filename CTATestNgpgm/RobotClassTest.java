package CTATestNgpgm;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RobotClassTest {
	
	public static void main(String[] args) throws AWTException {
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		
		System.out.println("KeyPress Keyboard CTRLC");
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		
		System.out.println("KeyRelease Keyboard CTRLC");
		
		
		//------------copying file path to clipboard-------------//
	/*	StringSelection str = new StringSelection("c:\\users\\chait\\desktop\\file upload.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		//press control+v for pasting
		rb.KeyPress(KeyEvent.VK_CONTROL);
		rb.KeyPress(KeyEvent.VK_C);
		
		//RELEASE CONTROL+V FOR PASTING
		rb.KeyRelease(KeyEvent.VK_CONTROL);
		rb.KeyRelease(KeyEvent.VK_C);
		
		//PRESSING AND RELEASING eNTER
		rb.KeyPress(KeyEvent.VK_ENTER);
		rb.KeyPress(KeyEvent.VK_ENTER);
		*/
		
		
		//----------for downloading file-------------//
		/*Map<String,Object> pref = new HashMap<String,Object>();
		pref.put("download.prompt_for_download",false);
		options.setExperimentalOption("pref",pref);
		
		RemoteWebDriver driver = new ChromeDriver(options);
		
		WebElement btnDownload =driver.findElement(By.xpath(".//a[text()="chromedriver_win32.zip"]"));
		btnDownload.click();
		*/
		
	}

}
