package Handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sdilipma\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.guru99.com";
		driver.get(url);
		driver.manage().window().maximize();
		
		//to get title
		String url1 = driver.getTitle();
		System.out.println(url1);
		
		//to get current title
		String url2 = driver.getCurrentUrl();
		System.out.println(url2);
		
		//driver.findElement(By.id("gsc-i-id1")).sendKeys("SQL");
		//driver.findElement(By.className("gsc-search-button")).click();
		//driver.findElement(By.xpath("//*[@id=\"___gcse_0\"]/div/div/div[1]/div[1]"));
		Thread.sleep(2000);
		driver.findElement(By.name("search")).sendKeys("Testing");
		
		
		
		

	}

}
