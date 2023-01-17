package newpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class self_reliant {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\Ashish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Opening website
        driver.get("file:///C:/Users/Ashish/OneDrive/Desktop/website/index.html");
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.findElement(By.className("inp")).click();
        Thread.sleep(1000);
        // get serach by xpth
        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/input")).sendKeys("Ferguson collge");
        Thread.sleep(1000);
        driver.findElement(By.className("fas fa-search")).click();
        Thread.sleep(1000);
        
        //Register 
        driver.findElement(By.xpath("//*[@id=\"bottonone\"]/a/b")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr[1]/td[2]/input")).sendKeys("Vaishnavi");
        //Lastname
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td[2]/input")).sendKeys("Bhambure");
        //DOB
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr[3]/td[2]/input")).sendKeys("01/02/2002");
        //Stream
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr[4]/td[2]/select")).sendKeys("Science");
        //gender
        
        WebElement radio1=  driver.findElement(By.xpath("/html/body/div/table/tbody/tr[5]/td[2]/input[2]"));
        radio1.click();
        System.out.println(radio1.isSelected());
        //Moblie no
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr[6]/td[2]/input")).sendKeys("8859764788");
        //Email id
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr[7]/td[2]/input")).sendKeys("vaishnubhabure@gmail.com");
        //country
        Actions ac=new Actions(driver);
        driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div/table/tbody/tr[8]/td[2]/select")));
    	WebElement src=driver.findElement(By.xpath("/html/body/div/table/tbody/tr[8]/td[2]/select/option[2]"));
    	src.click();
      //username
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr[9]/td[2]/input")).sendKeys("VaishnuB");
      //password
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr[10]/td[2]/input")).sendKeys("Vaish@123");
      //confirmpassword
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr[11]/td[2]/input")).sendKeys("Vaish@123");
        //checkbox
        driver.findElement(By.id("ch")).click();
        //submitbutton
        driver.findElement(By.xpath("/html/body/div/button/a")).click();
        //to login
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/ul/li[7]/a")).click();
        //to enter username
        driver.findElement(By.id("user")).sendKeys("VaishnuB");
      //to enter password
        driver.findElement(By.id("pss")).sendKeys("Vaish@123");
        //submit
        driver.findElement(By.xpath("/html/body/form/button/a")).click();
        //feedback
        driver.findElement(By.id("bottontwo")).click();
        driver.findElement(By.name("email")).sendKeys("vaishnubhambure@gmail.com");
        driver.findElement(By.xpath("/html/body/div/center/form/font/table/tbody/tr[2]/td[2]/textarea")).sendKeys("Sometimes itsnot word properly");
        
	}
	

}
