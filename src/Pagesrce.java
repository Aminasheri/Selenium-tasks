import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesrce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
	String src=	driver.getPageSource();
		if (src.contains("Gmail"))
		{
		System.out.println("present");
	}
		else {
			System.out.println("not present");

		}
		
	String src1=driver.getPageSource()	;
		if(src1.contains("images"))
		{
			System.out.println("present");
		}	
		else {
			System.out.println("not present");
		}
			
}
	
	
}