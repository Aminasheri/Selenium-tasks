package junitpkg;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Fblogin {
ChromeDriver driver;
	
	@Before
	public void setup()
	{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	
	}
	@Test
	public void test1()
	{
	driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("asd12345");
	driver.findElement(By.name("login")).click();  
	
	}
	
	
}
