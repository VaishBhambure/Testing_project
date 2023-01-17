package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop_down {
	public static  void main (String[] args) {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\Ashish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.facebook.com/signup/");
		Select oselect=new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
		oselect.selectByVisibleText("Feb");
		Select oselect1=new Select(driver.findElement(By.xpath("//*[@id='year']")));
		oselect1.selectByIndex(5);
		
		Select oselect2=new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
		oselect2.selectByValue("1");
		
		List<WebElement> st=oselect.getOptions();
		for(WebElement opt:st)
			System.out.println(opt.getText());
		
		List<WebElement> st1=oselect1.getOptions();
		for(WebElement opt:st1)
			System.out.println(opt.getText());
			
		List<WebElement> st2=oselect2.getOptions();
		for(WebElement opt:st2)
			System.out.println(opt.getText());

	}
}
