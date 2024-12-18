package Handson;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sdilipma\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String url = "https://demo.automationtesting.in/Alerts.html";
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		//switch to simple alert
		Alert a = driver.switchTo().alert();
		//to accept alert
		a.accept();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		//switch to confirm alert
		Alert b = driver.switchTo().alert();
		//to accept alert
		b.accept();
		//to dismiss alert
		//b.dismiss();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		//switch to prompt alert
		Alert c = driver.switchTo().alert();
		//passing values in alert
		c.sendKeys("Sanket");
		//to accept alert
		c.accept();
		
		

	}

}
