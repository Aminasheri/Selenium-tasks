package testNGpackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonprgm {

	

	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
	driver=new ChromeDriver();
       driver.get("https:www.amazon.in/");
	}
	
	@Test
	public void test()
	{
		driver.manage().window().maximize();
	String parentWindow=driver.getWindowHandle();
	WebElement search=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	search.sendKeys("mobilephones");
	WebElement submit=driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
	submit.click();
     String title = driver.getTitle();
   System.out.println("actualTitle =" +title);
     WebElement mob1=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));;
      mob1.click();
Set<String> windowHandles = driver.getWindowHandles();	
	for(String childwindow:windowHandles) {
		if(!childwindow.equalsIgnoreCase(parentWindow)){
	 driver.switchTo().window(childwindow);
			
	 WebElement addtocart=driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
	 addtocart.click();
   
	
	 WebElement  cart=driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input"));                                                                                                                     
	 cart.click();
		
		
		}
	 
}
	 
}	 

}