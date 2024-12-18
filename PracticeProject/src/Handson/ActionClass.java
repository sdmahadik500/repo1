package Handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sdilipma\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//String url = "https://www.browserstack.com/";
		//driver.get(url);
		driver.get("https://demo.automationtesting.in/Static.html");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		/*//move to element
		WebElement testing = driver.findElement(By.xpath("//*[@id=\"signupModalProductButton\"]"));
		Thread.sleep(3000);
		a.contextClick(testing).perform();
		//a.doubleClick(testing).perform();
		//a.moveToElement(testing).click();
		Thread.sleep(3000);*/
		
		WebElement source = driver.findElement(By.xpath("//*[@id=\"angular\"]"));
		WebElement dest = driver.findElement(By.xpath("//*[@id=\"droparea\"]"));
		a.dragAndDrop(source, dest).perform();
		
		//
		
		
		
		
		//double click
		//a.doubleClick(testing).perform();
		
	

	}

}
