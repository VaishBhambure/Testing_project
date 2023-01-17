package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
		
		WebDriver driver;
		
		@Given("I am a user of amazon.com")
		public void i_am_a_user_of_amazon_com() throws InterruptedException {
			
			System.setProperty("Webdriver.chrome.driver",
					"C:\\Users\\Ashish\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
	        driver.get("https://www.amazon.in/");
	        Thread.sleep(2000);
		   
		}

		@When("I log in using valid credentials")
		public void i_log_in_using_valid_credentials() {
			driver.findElement(By.id("nav-link-accountList")).click(); 
	        driver.findElement(By.id("ap_email")).sendKeys("salvipriyanka1710@gmail.com");
	        driver.findElement(By.className("a-button-input")).click();
	        driver.findElement(By.id("ap_password")).sendKeys("Amazon#1710");
	        
		   
		}

		@Then("I should be logged in")
		public void i_should_be_logged_in() {
			driver.findElement(By.id("signInSubmit")).click();
		   
		}
		
		@When("I log in using invalid credentials")
		public void i_log_in_using_invalid_credentials() {
			driver.findElement(By.id("nav-link-accountList")).click(); 
	        driver.findElement(By.id("ap_email")).sendKeys("salvipriyanka1710@gmail.com");
	        driver.findElement(By.className("a-button-input")).click();
	        driver.findElement(By.id("ap_password")).sendKeys("Amazon710");
	        
		   
		}

		@Then("I should not be logged in")
		public void i_should_not_be_logged_in() {
			driver.findElement(By.id("signInSubmit")).click();

	}
	}

