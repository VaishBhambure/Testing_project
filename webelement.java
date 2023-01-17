package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class webelement {
	public static void main(String[] args) {
		
	System.setProperty("Webdriver.chrome.driver","C:\\Users\\Ashish\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver(); //Parent p=new Child (webdriver is Parent & ChromeDriver is Child)
	
	driver.get("https://www.zomato.com/");
	driver.findElement(By.className("sc-18n4g8v-0 gAhmYY sc-dTLGrV hWsxDt")).click();
	driver.quit();
WebDriver driver1=new ChromeDriver(); //Parent p=new Child (webdriver is Parent & ChromeDriver is Child)
	
	driver1.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).click();
	
	}

}
