package testNGpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriven {
ChromeDriver driver;

@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
}
 @Test
public void test() throws Exception
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 
 FileInputStream ob=new FileInputStream("C:\\Users\\Lant\\Desktop//Book1.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(ob);//WORKBOOK
 XSSFSheet sh=wb.getSheet("Sheet1");//SHEET DETAILS
  int row=sh.getLastRowNum();//row details
 
 for(int i=1;i<=row;i++)
 {
 String username=sh.getRow(i).getCell(0).getStringCellValue();
	 System.out.println("username="+username);
	 String pswd=sh.getRow(i).getCell(1).getStringCellValue();
	 System.out.println("passwd="+pswd);
	 
	 driver.findElement(By.id("email")).clear();
	 driver.findElement(By.id("email")).sendKeys(username);
	 
	 driver.findElement(By.id("email")).clear();
	 driver.findElement(By.name("pass")).sendKeys(pswd);
	 driver.findElement(By.name("login")).click();
	 
	 driver.navigate().back();
	 driver.navigate().refresh();
	 
	 
}
}}


