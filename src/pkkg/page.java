package pkkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class page {; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		String src=driver.getPageSource();
		
		String actualTitle=driver.getTitle();
		String expectedTitle=("google");
		
		if(actualTitle.equals(expectedTitle))
		{
		System.out.println("pass");	
	}
		else
		{
	
	System.out.println("fail");

}
		
		
}
}