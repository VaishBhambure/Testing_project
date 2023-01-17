package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newmethods {
	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\Ashish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); //Parent p=new Child (webdriver is Parent & ChromeDriver is Child)
		
		driver.get("https://www.myntra.com/");
		driver.navigate().to("https://www.w3schools.com/");
		String t1=driver.getTitle();
		System.out.println("the title is website is "+t1);
		String url1=driver.getCurrentUrl();
		System.out.println("Url is  "+url1);
		driver.navigate().back();
		String url2=driver.getCurrentUrl();
		System.out.println("Url is  "+url2);
		
		
		
	}

}
