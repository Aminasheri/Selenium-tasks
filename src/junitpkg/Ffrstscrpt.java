package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ffrstscrpt {
	ChromeDriver driver;
      @Before
    public void setup()
    {
	driver=new ChromeDriver();
	driver.get("https://automationexercise.com/login");
    }
	  
	@Test
	public void test1()
	{
		
	WebElement name=driver.findElement(By.xpath("//input[@name=\"name\"]"));
	name.sendKeys("amina");
	WebElement email=driver.findElement(By.xpath("//*[@data-qa=\"signup-email\"]"));
	email.sendKeys("ami@gmail.com");
	
	name.submit();
	WebElement password=driver.findElement(By.xpath("//input[@id=\"password\"]"));
	password.sendKeys("123456");
	
	
	WebElement day=driver.findElement(By.xpath("//*[@name=\"days\"]"));
	Select daydetails=new Select(day);
	daydetails.selectByValue("2");
	WebElement month=driver.findElement(By.xpath("//*[@id=\"months\"]"));
	Select monthdetails=new Select(month);
	monthdetails.selectByValue("12");
	WebElement year=driver.findElement(By.xpath("//*[@id=\"years\"]"));
	Select yeardetails=new Select(year);
	yeardetails.selectByValue("1997");
	
	WebElement check1=driver.findElement(By.xpath("//*[@id=\"newsletter\"]"));
	check1.click();
	
	WebElement check2=driver.findElement(By.xpath("//*[@id=\"optin\"]"));
	check2.click();
	
	WebElement fullname=driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
	fullname.sendKeys("aminasherif");
	
	WebElement lastname=driver.findElement(By.xpath("//*[@id=\"last_name\"]"));
	lastname.sendKeys("s");
	
	WebElement address=driver.findElement(By.xpath("//*[@id=\"address1\"]"));
	address.sendKeys("sherma manzil akkolilcherry ");
	WebElement address2=driver.findElement(By.xpath("//*[@id=\"address2\"]"));
	address2.sendKeys("mayyanad po kollam 691302");
	
	WebElement country=driver.findElement(By.xpath("//*[@id=\"country\"]"));
	Select countrydetails=new Select(country);
	countrydetails.selectByValue("United States");
	
	WebElement state=driver.findElement(By.xpath("//*[@id=\"state\"]"));
	state.sendKeys("kerala");
	
	WebElement city=driver.findElement(By.xpath("//*[@id=\"city\"]"));
	city.sendKeys("kollam");
	
	WebElement zipcode=driver.findElement(By.xpath("//*[@id=\"zipcode\"]"));
	zipcode.sendKeys("691303");
	
	WebElement mobno=driver.findElement(By.xpath("//*[@id=\"mobile_number\"]"));
	mobno.sendKeys("1234567891");
	
	mobno.submit();
	
	}
	
	
}
	
	
	
	

