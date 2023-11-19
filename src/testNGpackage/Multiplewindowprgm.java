package testNGpackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Multiplewindowprgm {

	
	
ChromeDriver driver;
	
	@BeforeTest
	public void setup() throws Exception{
	
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/popup.php");
	}	
	
	
	 
	@Test
	public void test()
	{
	String parentwindow=driver.getWindowHandle();  //currentwindow
	System.out.println("parentwindow title=" +driver.getTitle() );
	driver.findElement(By.xpath("/html/body/p/a")).click();
	
	
	Set<String>allwindowhandles=driver.getWindowHandles();
	for(String childwindow:allwindowhandles) {
	System.out.println("childwindow=" +driver.getTitle());
		if(!childwindow.equalsIgnoreCase(parentwindow)) {
		driver.switchTo().window(childwindow);
	
	

	driver.findElement(By.name("emailid")).sendKeys("ami@gmail.com");
	driver.findElement(By.name("btnLogin")).click();
	driver.close();
	
	}
		driver.switchTo().window(parentwindow);
	}
	
	}}
	
	

