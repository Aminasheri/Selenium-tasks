package testNGpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {

	@BeforeTest
	public void setup()
	{
	System.out.println("browser open");
	}
	
	@BeforeMethod
	public void urlloading()
	{
	
	System.out.println("url details");
	}
	@Test(groups= {"smoke"})
	public void test1()
	{
	System.out.println("test1");
	
	
	}
	
	@Test()
	public void test2()
	{
		
	System.out.println("test2")	;
	}	
	
	@AfterMethod
	public void aftermethd()
	{
	System.out.println("aftermethd");
	}	
	
	@AfterTest
	public void browserclose()
	{
	
	System.out.println("browserclse");
	}
	
	
	
}
