package CTATestNgpgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class NewTest {

    WebDriver driver;

    @Parameters({"username", "password"})
    @Test
    public void f(String username, String password) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Enter credentials
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // Wait to verify login result (you can replace with WebDriverWait)
        Thread.sleep(3000);  // Not best practice, just for quick testing

        // Optional: Verify login by checking if dashboard element exists
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("dashboard")) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Login failed.");
        }

        // Close the browser
        driver.quit();
    }

    @BeforeMethod
    public void beforeMethod() {}

    @AfterMethod
    public void afterMethod() {}

    @BeforeClass
    public void beforeClass() {}

    @AfterClass
    public void afterClass() {}

    @BeforeTest
    public void beforeTest() {}

    @AfterTest
    public void afterTest() {}

    @BeforeSuite
    public void beforeSuite() {}

    @AfterSuite
    public void afterSuite() {}
}
