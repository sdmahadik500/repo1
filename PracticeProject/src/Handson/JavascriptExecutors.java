package Handson;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutors {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sdilipma\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String url = "https://practicetestautomation.com/practice-test-login/";
		driver.get(url);
		driver.manage().window().maximize();
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		
		/*WebElement txtScroll = driver.findElement(By.xpath("//*[@id=\"login\"]/h2"));
		//scroll down
		js.executeScript("arguments[0].scrollIntoView(true)", txtScroll);
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("student");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click(); */
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement txtScroll = driver.findElement(By.xpath("//*[@id=\"login\"]/h2"));
		//scroll down
		js.executeScript("arguments[0].scrollIntoView(true)",txtScroll);
		Thread.sleep(2000);
		//pass values in textbox
		WebElement txtEmail = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		js.executeScript("arguments[0].setAttribute('value','student')",txtEmail);
		
		//retrieve the user entered text
		Object object = js.executeScript("return arguments[0].getAttribute('value')",txtEmail);
		
		//upcasting
		String s1 = (String)object;
		System.out.println(s1);
		Thread.sleep(2000);
		WebElement txtPass = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		js.executeScript("arguments[0].setAttribute('value','Password123')",txtPass);
		
		//button click using javascript
		WebElement btnLogin = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
		js.executeScript("arguments[0].click()",btnLogin);
		
		 
		
	
		
		
		
	
		
	
		
		
		

	}

}
