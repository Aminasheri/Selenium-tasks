import org.openqa.selenium.chrome.ChromeDriver;

public class frstscript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");;
		String expectedtitle="google";
		String actualtitle = driver.getTitle();
		if(actualtitle.equalsIgnoreCase(expectedtitle))
		{
		System.out.println("pass");
		
	}
		else {
			
			System.out.println("fail");	
		}
		
	}	
		
		
}
