package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fblogin {

	WebDriver driver; 
	
	By fbemail=By.id("email");
	By fbpasswd=By.name("pass");
	By login=By.name("login");
	
	
	//create constructor for driver
	public Fblogin(WebDriver driver) {
	
	this.driver=driver;
}
	
	//method creating for pass values
	
	public void setValues(String email,String passwd) {
	
	driver.findElement(fbemail).sendKeys(email);
	driver.findElement(fbpasswd).sendKeys(passwd);
	
	
	
	
	
	}
	public void login() {
	
		driver.findElement(login).click();
		
		
		
		
	}		
}