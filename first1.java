package newpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class first1 {
	public static void main(String[] args) {
		//Set the path of executable Browser Driver
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\Ashish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("Webdriver.firefox.FirefoxDriver","C:\\Users\\Ashish\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		WebDriver driver=new ChromeDriver(); //Parent p=new Child (webdriver is Parent & ChromeDriver is Child)
		//WebDriver driver1=new FirefoxDriver();
		driver.get("http://selenium.dev");
		
		System.out.println(driver.getTitle());
		driver.quit(); //closing browser
		//driver1.get("https://www.amazon.in");
		//System.out.println(driver1.getTitle());
		//driver1.quit();
		
		
	}


}
