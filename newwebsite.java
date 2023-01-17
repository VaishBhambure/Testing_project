package newpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class newwebsite {
	public static void main(String[] args) {
		//Set the path of executable Browser Driver
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\Mohini\\Desktop\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); //Parent p=new Child (webdriver is Parent & ChromeDriver is Child)
		
		driver.get("https://www.myntra.com/");
		driver.navigate().to("https://www.w3schools.com/");
		//System.out.println(driver.getTitle());
		
		
		
	}

}
