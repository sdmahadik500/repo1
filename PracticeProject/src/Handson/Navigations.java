package Handson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sdilipma\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.w3schools.com/html/html_tables.asp";
		driver.get(url);
		driver.manage().window().maximize();
		
		//navigate to next url
		driver.navigate().to("https://www.guru99.com");
		Thread.sleep(3000);
		
		//to go to previous page
		driver.navigate().back();
		Thread.sleep(3000);
		
		//to go to next page
		driver.navigate().forward();
		Thread.sleep(3000);
		
		//to refresh the page
		driver.navigate().refresh();
		driver.close(); 

	}

}
