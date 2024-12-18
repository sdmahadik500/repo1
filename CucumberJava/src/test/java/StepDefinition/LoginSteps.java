package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver = null;

	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sdilipma\\eclipse-workspace\\CucumberJava\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		
	}

	@When("user scrolls down")
	public void user_scrolls_down() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement txtscroll = driver.findElement(By.xpath("//*[@id=\"login\"]/h2"));
		js.executeScript("arguments[0].scrollIntoView(true)", txtscroll);	
		Thread.sleep(3000);
		
	}
		
	
	@And("enter username and password")
	public void enter_username_and_password() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("student");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
		Thread.sleep(3000);
	}
	
	@And("clicks on submit button")
	public void clicks_on_submit_button() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		Thread.sleep(3000);
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		driver.getPageSource().contains("Logged In Successfully");

	}
}
