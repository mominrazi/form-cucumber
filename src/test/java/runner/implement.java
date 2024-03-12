package runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class implement {
	
	WebDriver driver;
	

	
	@Given("user open chrome and enter url")
	public void user_open_chrome_and_enter_url() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91735\\Downloads\\notes\\selenium grid\\chromedriver.exe")
		;
				driver= new ChromeDriver();
				
				driver.get("https://v1.training-support.net/selenium/login-form");
				driver.manage().window().maximize();
				
				Thread.sleep(3000);
	}

	@When("user enter username")
	public void user_enter_username() {
	   driver.findElement(By.name("Username")).sendKeys("mominrazi");
	}

	@When("user enter password")
	public void user_enter_password() {
	   driver.findElement(By.name("Password")).sendKeys("1234567");
	}

	@When("click on login")
	public void click_on_login() {
	    driver.findElement(By.xpath("//button[@onclick=\"signIn()\"]")).click();
	}

	@Then("welcome back message is displayed")
	public void welcome_back_message_is_displayed() {
	   System.out.println("its working");
	}


}
