package junitpkg;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	
      ChromeDriver driver;   
      
	@Before
	public void setUp()
	{
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
	}
	
	@Test
	public void test1()
	{
	String actualtitle=driver.getTitle();
	String expectedtitle="google";
   if(actualtitle.equalsIgnoreCase(expectedtitle))
    {	
	System.out.println("pass  ");
     }
   else {
	System.out.println("fail");
     }
	}
	
	@Test
	public void test2()
	{
String src=driver.getPageSource();
		if(src.contains("abc"))
		{
			System.out.println("pass");
		}
		else	
		{
			System.out.println("fail");
		}
	}
		
	@After
	public void tearDown()
	{
	driver.quit();
	
	}
}
		
		
		
		
		
		
		