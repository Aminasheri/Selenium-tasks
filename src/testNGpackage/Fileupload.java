package testNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {

	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/upload/");
	}
	
	@Test
	public void test()
	{
	WebElement uploadfile=driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
	uploadfile.sendKeys("C:\\Users\\Lant\\Desktop\\9numberaccepting.jpg");
	WebElement box=driver.findElement(By.xpath("//*[@id=\"terms\"]"));
	box.click();
  
	 
	
	
	
	
	
	
	
	
	
	}
}
