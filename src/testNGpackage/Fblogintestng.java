package testNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Fblogintestng {
     ChromeDriver driver;
	@BeforeTest
	
	
		public void setUp()
		{
		 driver=new ChromeDriver();

		}

	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.facebook.com/");

	}
	@Parameters({"email","passwd"})
	@Test
	public void test1(String email,String passwd) 
	{
	driver.findElement(By.name("email")).sendKeys(email);
	driver.findElement(By.name("pass")).sendKeys(passwd);
	driver.findElement(By.name("login")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
