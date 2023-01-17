package newpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
public class xpath_prog {
	public static  void main (String[] args) {
	System.setProperty("Webdriver.chrome.driver","C:\\Users\\Ashish\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.w3schools.com/");
	
	//Absolute xpath
	driver.findElement(By.xpath("/html/body/div[3]/a[4]")).click();
	//relative xpath

	/*Xpath=//tagname[@attribute='value']
			// : Select current node.
			Tagname: Tagname of the particular node.
			@: Select attribute.
			Attribute: Attribute name of the node.
			Value: Value of the attribute.*/
	driver.findElement(By.xpath("//a[@id='w3loginbtn']")).click();
	
	;
	}
}
