package junitpkg;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Ebaydemo {

	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
	driver=new ChromeDriver();
	driver.get("https://ebay.com");
	}
	
	
@Test
	public void test1()
	{
	 List<WebElement> li=driver.findElements(By.tagName("a"));
	  System.out.println("total number of links="+li.size());
	  
	  for(WebElement element:li)
	  {
	  String link=element.getAttribute("href");
	  String text=element.getText();
	  System.out.println(link+"------" +text);
	  }
	String expectedtitle="eBay";
	String Actualtitle=driver.getTitle();
	System.out.println("title is="+Actualtitle);
	if(Actualtitle.equalsIgnoreCase(expectedtitle))
	{
	System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	WebElement mb=driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
	mb.sendKeys("mobilephones");
	
	String src=driver.getPageSource();
	if(src.contains("Daily "))
	{
	System.out.println("present");
	}
	else {
		System.out.println("present");
	}
	}

 







@After
public void teardown()
{
driver.quit();

}

}



