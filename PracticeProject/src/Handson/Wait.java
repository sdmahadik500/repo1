package Handson;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sdilipma\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		String url = "https://www.w3schools.com/html/html_tables.asp";
		driver.get(url);
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/a[2]")).click();
		
		//explicit wait
		WebDriverWait w = new WebDriverWait (driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main\"]/h1")));
		
		//wrong xpath check
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"abc\"]/h1")));		
			
		
	
		
		
	}

}
