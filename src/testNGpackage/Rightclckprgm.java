package testNGpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rightclckprgm {

	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
	driver=new ChromeDriver();
	driver.get(" https://demo.guru99.com/test/simple_context_menu.html");
	}
	@Test
	public void rightclck()
	{
	WebElement rightclk=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	Actions act=new Actions(driver);	
	act.contextClick(rightclk).perform();
	driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
	driver.switchTo().alert().accept();//alert
	
	//doubleclk
	WebElement doubleclkelement=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));	  
	act.doubleClick(doubleclkelement).perform();
	
	Alert a=driver.switchTo().alert();//storing alert refernce
	String text=a.getText();   // getting alert text 
	System.out.println("alert text="+text );
	a.accept();
	
	}
	
}
