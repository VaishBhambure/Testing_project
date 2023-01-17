package newpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
public class webele {
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\Ashish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.edubridgeindia.com");
		
//		login page for edubridge
		
		driver.navigate().to("https://www.edubridgeindia.com/login");
		
		driver.findElement(By.id("login_mobile")).sendKeys("9076084003");
		
		driver.findElement(By.id("login_password")).sendKeys("Vaishnu0@");
		
//		System.out.println(driver.findElement(By.cssSelector("label[class*='form-check form-check-label']")).isSelected());

		driver.findElement(By.cssSelector("label[class*='form-check form-check-label']")).click();
		
//		driver.findElement(By.linkText("Keep me logged in")).click();
		
		driver.findElement(By.id("btnLoginSubmit")).click();
		
//		My courses page in edubridge 
		
		driver.findElement(By.className("cursor mb-0")).click();
		
		driver.findElement(By.className("zmycourses zycourses-all py-2 cursor active")).click();
		
		driver.findElement(By.className("zcoursecard_text card-link cursor-pointer cursor pb-1")).click();
		
		
		driver.findElement(By.xpath("/html/body/div[12]/a[1]")).click();
	}

}
