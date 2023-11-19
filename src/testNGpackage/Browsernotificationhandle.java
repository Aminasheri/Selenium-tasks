package testNGpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Browsernotificationhandle {

	WebDriver driver;
	@BeforeTest
	public void setup() throws Exception
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable notifications");
		driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	}
	
	  
	@Test
	public void test()
	{
	
	driver.get("justdial.com");
	
	}
	
	
}
