package CTATestNgpgm;

import java.io.File;


import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DDFExcelTestingData {
	File  file;
	FileInputStream fis;
	
	XSSFWorkbook wb;
	
	XSSFSheet sheet;
	
	XSSFRow row;
	
	XSSFCell cell;
	
	WebDriver driver = new ChromeDriver();	
	
	

  @Test(dataProvider = "readExcell")
  public void login (String name, String pspw) {
	  
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(name);

	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(pspw);

	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  
	  System.out.println("userName: "+name+"password: "+pspw);
	  
	  
  }
  @DataProvider
	public Object[][] readExcell() throws IOException{
		String fpath = "D:\\ExcelFile\\OrangehrmLogin.xlsx";
		file = new File(fpath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(0);
		
		int rowcount = sheet.getPhysicalNumberOfRows();
		int columncount = sheet.getRow(0).getPhysicalNumberOfCells();
		String[][] loginData = new String
				[rowcount-1][columncount-1];
		for(int r=1; r<rowcount;r++) {
			row=sheet.getRow(r);
			for(int c=0; c<columncount-1;c++) {
				cell=row.getCell(c);
				loginData[r-1][c]=cell.getStringCellValue();
			
				
			}
		}
	
		return loginData;
	};
	@BeforeTest
	public void beforeTest() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@AfterTest
	public void afterTest() throws IOException{
		wb.close();
		fis.close();
	}
}
