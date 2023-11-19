package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Fbcreatepage;
import pagepkg.Fblogin;


public class Fblogintest {
WebDriver driver;

	@BeforeTest
	public void setUp()
	{
	driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	}
	@Test
	public void test() {
		Fblogin ob=new Fblogin(driver);
		
		ob.setValues("ami","1234hf");
		ob.login();
		driver.navigate().back();
		Fbcreatepage ob1= new Fbcreatepage(driver);
		ob1.pageclick();
ob1.getstartedbutton();
		

	}
	

}