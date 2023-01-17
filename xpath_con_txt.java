package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class xpath_con_txt {
	public static  void main (String[] args) {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\Ashish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		driver.findElement(By.name("username")).sendKeys("_navi._03");
		driver.findElement(By.name("password")).sendKeys("251198");
		driver.findElement(By.className("_acan _aiit _acap _aijb _acas _aj1-")).click();
	//driver.quit();
		
		
	}

	

}
