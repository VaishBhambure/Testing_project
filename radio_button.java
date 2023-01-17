package newpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio_button {
public static void main(String[] args, Object elm) {
		
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\Ashish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file://C:/Users/Ashish/OneDrive/Desktop/ST%20Programs/form1.html");
		
		driver.findElement(By.id("name")).sendKeys("vaishnavi");
		
		driver.findElement(By.id("lname")).sendKeys("bhambure");
		
		driver.findElement(By.id("dob")).sendKeys("1/2/2002");
		
		driver.findElement(By.id("strm")).sendKeys("Science");
		
		driver.findElement(By.id("ma")).click();
		
		//driver.findElement(By.cssSelector("input[id*='mob']")).click();
		
		//driver.findElement(By.cssSelector("input[id*='marathi']")).click();
		
		//driver.findElement(By.cssSelector("input[id*='eng']")).click();
		
		driver.findElement(By.id("sub1")).submit();
		
	

	}
}
