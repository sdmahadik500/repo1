package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG {
	
	WebDriver driver;
	
	//@BeforeMethod
	@Test(priority=1)
	void login() throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sdilipma\\eclipse-workspace\\CucumberJava\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//SoftAssert softAssert = new SoftAssert();
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		String Title1= driver.getTitle();
		System.out.println(Title1);
		String Title2= "Test Login | Practice Test Automation";
		Assert.assertTrue(Title1 == Title2 );
		//softAssert.assertEquals("Title1", "Title2");
		//softAssert.assertAll();
	}
	
	@Test(priority=2)
	void scrolldown() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement txtscroll = driver.findElement(By.xpath("//*[@id=\"login\"]/h2"));
		js.executeScript("arguments[0].scrollIntoView(true)", txtscroll);	
		Thread.sleep(3000);
	}
	
	@Test(priority=3)
	void credentials() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("student");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
		Thread.sleep(3000);
	}
	
	@Test(priority=4)
	void submit() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		Thread.sleep(3000);
	}
	
	//@AfterMethod
	@Test(priority=5)
	void validation()
	{
		driver.getPageSource().contains("Logged In Successfully");
		String Title1= driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[1]/h1")).getText();
		System.out.println(Title1);
		String Title2= "Logged In Successfully";
		Assert.assertEquals(Title1, Title2);
	}
	

}
