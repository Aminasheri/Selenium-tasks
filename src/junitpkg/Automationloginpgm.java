package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automationloginpgm {
	 ChromeDriver driver;    
		@Before
		public void setUp()
		{
		 driver=new ChromeDriver();
		driver.get("https://automationexercise.com/login");
		}
		
		@Test
		public void test()
		{
		WebElement id=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]"));
		Select emaildetails=new Select(email);
		
		
	}




	
	
	
	
}
