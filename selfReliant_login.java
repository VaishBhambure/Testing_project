package StepDefinations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class selfReliant_login {
   WebDriver driver;
		@Given("I am a user of selfreliant.com")
		public void i_am_a_user_of_amazon_com() throws InterruptedException {
			
			System.setProperty("Webdriver.chrome.driver",
					"C:\\Users\\Ashish\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
	        driver.get("file:///C:/Users/Ashish/OneDrive/Desktop/website/index.html");
	        Thread.sleep(2000); 
		}
		@When("I log in using valid credentials")
		public void i_log_in_using_valid_credentials() {
			 driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/ul/li[7]/a")).click();
		        //to enter username
		        driver.findElement(By.id("user")).sendKeys("VaishnuB");
		      //to enter password
		        driver.findElement(By.id("pss")).sendKeys("Vaish@123");
		   
		}
		@Then("I should be logged in")
		public void i_should_be_logged_in() {
			driver.findElement(By.xpath("/html/body/form/button/a")).click();
		   
		}
	    @When("I log in using invalid credentials")
		public void i_log_in_using_invalid_credentials() {
			 driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/ul/li[7]/a")).click();
		        //to enter username
		        driver.findElement(By.id("user")).sendKeys("Bhambure");
		      //to enter password
		        driver.findElement(By.id("pss")).sendKeys("Vaish@12");  
		}

		@Then("I should not be logged in")
		public void i_should_not_be_logged_in() {
			driver.findElement(By.xpath("/html/body/form/button/a")).click();

	}
	}




